package ru.mywebapp;


public class RecordImpl implements IRecord
{
    public String m_name, m_surname, m_patr;
    public Integer m_mark;

    public RecordImpl(String name, String surname, String patr, Integer mark)
    {
        m_name = name;
        m_surname = surname;
        m_patr = patr;
        m_mark = mark;
    }
}
