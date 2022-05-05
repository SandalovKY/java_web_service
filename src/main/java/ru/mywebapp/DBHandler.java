package ru.mywebapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import org.bson.Document;

class CustomComparatot implements Comparator<WorkRecord>
{
@Override
public int compare(WorkRecord arg0, WorkRecord arg1) {
    return arg0.numMarks.compareTo(arg1.numMarks);
}
}

class WorkRecord
{
    public String name, surname, patr;
    public String workName;
    public Integer workId;
    public HashMap<String, Integer> marks;
    public Double averMark;
    public Integer numMarks;
    public byte[] data;

    public WorkRecord(BasicDBObject obj, BasicDBObject stObj)
    {
        if (obj != null)
        {
            System.out.println(stObj);
            name = (String)stObj.get("name");
            surname = (String)stObj.get("surname");
            patr = (String)stObj.get("patr");

            System.out.println("NAME: " + name);

            workName = (String)obj.get("workname");
            workId = (Integer)obj.get("workId");
            data = (byte[])obj.get("work");
            BasicDBObject doc =  (BasicDBObject)obj.get("marks");
            averMark = 0.;
            numMarks = doc.size();

            marks = new HashMap<>();
            if (numMarks > 0)
            {
                Double sum = 0.;
                for (String key: doc.keySet())
                {
                    Integer mark = doc.getInt(key);
                    sum += mark;
                    marks.put(key, mark);
                }
                averMark = sum / doc.size();
            }
        }
    }
    public WorkRecord(String workName, Integer workId)
    {
        this.workName = workName;
        this.workId = workId;

        name = null;
        surname = null;
        patr = null;
        data = null;
        marks = null;
        averMark = null;
        numMarks = null;
    }
}

public class DBHandler implements IStudentsTable
{
    private MongoClient mongoClient;
    private MongoDatabase dataBase;

    private static final String studentsTableName = "students";
    private static final String studentWorksTableName = "studentWorks";

    private MongoCollection<Document> worksTable;
    private MongoCollection<Document> studentsTable;


    public DBHandler()
    {
        mongoClient = new MongoClient("localhost", 27017);
        dataBase = mongoClient.getDatabase("mynewdb");

        boolean foundStudentTable = false;
        boolean foundStudentWorksTable = false;

        for (String collection: dataBase.listCollectionNames())
        {
            if (collection.equals(studentsTableName))
            {
                foundStudentTable = true;
            }
            if (collection.equals(studentWorksTableName))
            {
                foundStudentWorksTable = true;
            }
        }

        if (!foundStudentTable) addTable(studentsTableName);
        studentsTable = dataBase.getCollection(studentsTableName);

        if (!foundStudentWorksTable) addTable(studentWorksTableName);
        worksTable = dataBase.getCollection(studentWorksTableName);
    }

    @Override
    public Integer addStudentsWorkFile(Integer studentId, String workName, byte[] text) {
        Integer workHash = text.hashCode();

        Integer workId = studentId + workHash;

        BasicDBObject marks = new BasicDBObject();

        Document document = new Document()
        .append("studentId", studentId)
        .append("workname", workName)
        .append("workId", workId)
        .append("work", text)
        .append("marks", marks);

        worksTable.insertOne(document);

        return workId;
    }

    @Override
    public WorkRecord getDataForWorkRecord(Integer workId)
    {
        WorkRecord wr = null;
        BasicDBObject obj = getWorkData(workId);
        Integer studentId = (Integer)obj.get("studentId");
        BasicDBObject stObj = getStudentData(studentId);
        if (obj != null)
        {
            wr = new WorkRecord(obj, stObj);
        }
        return wr;
    }

    @Override
    public ArrayList<WorkRecord> getDataForWorkRecords()
    {
        FindIterable<Document> iterDoc = worksTable.find();
        MongoCursor<Document> it = iterDoc.iterator();
        ArrayList<WorkRecord> res = new ArrayList<>();
        while (it.hasNext())
        {
            Document obj = it.next();
            BasicDBObject jObj = BasicDBObject.parse(obj.toJson());
            Integer studentId = (Integer)jObj.get("studentId");
            BasicDBObject stObj = getStudentData(studentId);
            res.add(new WorkRecord(jObj, stObj));
        }
        return res;
    }

    @Override
    public ArrayList<WorkRecord> getDataForWorkRecords(Integer studentId)
    {
        FindIterable<Document> iterDoc = worksTable.find(Filters.ne("studentId", studentId));
        MongoCursor<Document> it = iterDoc.iterator();
        ArrayList<WorkRecord> res = new ArrayList<>();
        while (it.hasNext())
        {
            Document obj = it.next();
            BasicDBObject jObj = BasicDBObject.parse(obj.toJson());
            Integer otherStudentId = (Integer)jObj.get("studentId");
            BasicDBObject stObj = getStudentData(otherStudentId);
            res.add(new WorkRecord(jObj, stObj));
        }
        return res;
    }

    @Override
    public ArrayList<WorkRecord> getDataForWorkRecords(String name, String surname, String patr) {
        
        Integer studentId = (name + surname + patr).hashCode();
        Document document = new Document()
        .append("name", name)
        .append("surname", surname)
        .append("patr", patr)
        .append("studentId", studentId);
        if (studentsTable.count(Filters.eq("studentId", studentId)) == 0)
            studentsTable.insertOne(document);

        BasicDBObject query = new BasicDBObject("studentId", studentId);
        FindIterable<Document> iterDoc = worksTable.find(query);
        MongoCursor<Document> it = iterDoc.iterator();
        ArrayList<WorkRecord> res = new ArrayList<>();
        while (it.hasNext())
        {
            Document obj = it.next();
            BasicDBObject jObj = BasicDBObject.parse(obj.toJson());
            String workName = (String)jObj.get("workname");
            Integer id = (Integer)jObj.get("workId");
            res.add(new WorkRecord(workName, id));
        }
        return res;
    }

    @Override
    public void addMark(Integer workId, Integer mark, Integer studentId)
    {
        BasicDBObject obj = getWorkData(workId);

        if (obj != null)
        {
            BasicDBObject doc = (BasicDBObject)obj.get("marks");
            doc.append(Integer.toString(studentId), mark);
            worksTable.updateOne(Filters.eq("workId", workId), Updates.set("marks", doc));
        }
    }

    @Override
    public ArrayList<RecordImpl> getMarks(Integer workId)
    {
        ArrayList<RecordImpl> res = new ArrayList<>();
        BasicDBObject obj = getWorkData(workId);
        if (obj != null)
        {
            BasicDBObject doc = (BasicDBObject)obj.get("marks");
            for (String key: doc.keySet())
            {
                Integer mark = doc.getInt(key);
                BasicDBObject stData = getStudentData(Integer.parseInt(key));
                String name = stData.getString("name");
                String surname = stData.getString("surname");
                String patr = stData.getString("patr");
                res.add(new RecordImpl(name, surname, patr, mark));
            }
        }
        return res;
    }

    private BasicDBObject getWorkData(Integer workId)
    {
        BasicDBObject jObj = null;
        FindIterable<Document> iterDoc = worksTable.find(Filters.eq("workId", workId));

        MongoCursor<Document> it = iterDoc.iterator();
        if (it.hasNext())
        {
            Document obj = it.next();
            jObj = BasicDBObject.parse(obj.toJson());
        }
        return jObj;
    }

    private BasicDBObject getStudentData(Integer studentId)
    {
        BasicDBObject jObj = null;
        FindIterable<Document> iterDoc = studentsTable.find(Filters.eq("studentId", studentId));

        MongoCursor<Document> it = iterDoc.iterator();
        while (it.hasNext())
        {
            Document obj = it.next();
            jObj = BasicDBObject.parse(obj.toJson());

        }
        return jObj;
    }

    @Override
    public byte[] getStudentsWorkFile(Integer id) {

        BasicDBObject obj = getWorkData(id);

        if (obj != null)
        {
            return (byte[])obj.get("work");
        }
        return null;
    }

    @Override
    public Double getAverage(Integer id)
    {
        BasicDBObject obj = getWorkData(id);

        if (obj != null)
        {
            Double sum = 0.;
            BasicDBObject doc = (BasicDBObject)obj.get("marks");
            if (doc.size() > 0)
            {
                for (String key: doc.keySet())
                {
                    Integer mark = doc.getInt(key);
                    sum += mark;
                }
                sum /= doc.size();
            }
            return sum;
        }
        return 0.;
    }

    private void addTable(String name)
    {
        dataBase.createCollection(name);
    }
}
