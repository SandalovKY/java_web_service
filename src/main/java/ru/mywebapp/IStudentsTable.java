package ru.mywebapp;

import java.util.ArrayList;

public interface IStudentsTable {
    public Integer addStudentsWorkFile(Integer studentId, String workName, byte[] text);
    public byte[] getStudentsWorkFile(Integer id);

    // public Integer getNumMarks(Integer id);
    public Double getAverage(Integer id);

    public WorkRecord getDataForWorkRecord(Integer id);
    public ArrayList<WorkRecord> getDataForWorkRecords();
    public ArrayList<WorkRecord> getDataForWorkRecords(String name, String surname, String Patr);
    public ArrayList<WorkRecord> getDataForWorkRecords(Integer studentId);

    public void addMark(Integer workId, Integer mark, Integer studentId);
    public ArrayList<RecordImpl> getMarks(Integer workId);


}
