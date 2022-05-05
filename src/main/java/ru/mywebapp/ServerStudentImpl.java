package ru.mywebapp;

import java.util.ArrayList;
import java.util.Collections;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServerStudentImpl extends ServerBase implements IServerStudent
{
    public ServerStudentImpl(DBHandler db)
    {
        super(db);
    }

    @WebMethod
    @Override
    public ArrayList<WorkRecord> initConnection(String name, String surname, String patr)
    {
        return m_db.getDataForWorkRecords(name, surname, patr);
    }

    @WebMethod
    @Override
    public Integer loadWork(Integer userId, String workName, byte[] work) {
        Integer id = m_db.addStudentsWorkFile(userId, workName, work);
        return id;
    }


    @WebMethod
    @Override
    public ArrayList<Integer> getWorksForCheck(Integer userId) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<WorkRecord> records = m_db.getDataForWorkRecords(userId);
        System.out.println(records);
        Collections.sort(records, new CustomComparatot());
        System.out.println(records);
        Integer numOfRecords = Math.min(3, records.size());
        Integer i = 0;
        for (WorkRecord el: records)
        {
            if (i == numOfRecords) break;
            i += 1;
            System.out.println(el);
            System.out.println(el.workId);
            res.add(el.workId);
        }
        return res;
    }

    @WebMethod
    @Override
    public void setMark(Integer workId, Integer studentId, Integer mark) {
        m_db.addMark(workId, mark, studentId);
    }
}
