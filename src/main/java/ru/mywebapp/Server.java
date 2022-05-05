package ru.mywebapp;

import javax.xml.ws.Endpoint;

public class Server {
    private static final Integer port = 3030;
    public static void main(String[] args) {
        DBHandler db = new DBHandler();
        IServerStudent serviceForStudents = new ServerStudentImpl(db);
        IServerTeacher serviceForTeachers = new ServerTeacherImpl(db);
        String urlStudent = String.format("http://localhost:%d/Students", port);
        String urlTeacher = String.format("http://localhost:%d/Teachers", port);
        Endpoint.publish(urlStudent, serviceForStudents);
        Endpoint.publish(urlTeacher, serviceForTeachers);
    }
    
}
