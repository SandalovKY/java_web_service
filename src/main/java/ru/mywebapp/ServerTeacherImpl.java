package ru.mywebapp;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServerTeacherImpl extends ServerBase implements IServerTeacher
{
    public ServerTeacherImpl(DBHandler handler)
    {
        super(handler);
    }

    @WebMethod
    @Override
    public ArrayList<WorkRecord> getAllWorks()
    {
        ArrayList<WorkRecord> allWorks = m_db.getDataForWorkRecords();
        return allWorks.isEmpty() ? null : allWorks;
    }

    @WebMethod
    @Override
    public ArrayList<RecordImpl> getAllMarks(Integer id)
    {
        ArrayList<RecordImpl> marks = m_db.getMarks(id);
        return marks.isEmpty() ? null : marks;
    }
}
