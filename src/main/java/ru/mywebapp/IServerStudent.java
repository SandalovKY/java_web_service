package ru.mywebapp;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IServerStudent
{
    @WebMethod
    public Integer loadWork(Integer userId, String workName, byte[] work);
    @WebMethod
    public ArrayList<Integer> getWorksForCheck(Integer userId);
    @WebMethod
    public ArrayList<WorkRecord> initConnection(String name, String surname, String patr);
    @WebMethod
    public void setMark(Integer workId, Integer studentId, Integer mark);
}

@WebService
class ServerBase
{
    protected IStudentsTable m_db;

    public ServerBase(IStudentsTable db)
    {
        m_db = db;
    }

    @WebMethod
    public byte[] downloadWork(Integer workId)
    {
        return m_db.getStudentsWorkFile(workId);
    }
    @WebMethod
    public Double getMark(Integer workId)
    {
        return m_db.getAverage(workId);
    }
}
