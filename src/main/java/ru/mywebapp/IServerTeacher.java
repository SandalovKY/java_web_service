package ru.mywebapp;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IServerTeacher
{
    @WebMethod
    ArrayList<WorkRecord> getAllWorks();
    @WebMethod
    ArrayList<RecordImpl> getAllMarks(Integer id);
}
