package ru.mywebapp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

import server.generated.student.ServerStudentImpl;
import server.generated.student.ServerStudentImplService;
import server.generated.student.WorkRecord;

public class Client
{
    static enum MenuPoints
    {
        DEFAULT,
        ADD_WORK_FILE,
        GET_MARK_FOR_WORK,
        CHECK_WORK_FOR_OTHER,
        EXIT
    }
    // public static final int port = 3030;
    // public static final String url = "http://localhost:%d/Student?wsdl";

    static private ServerStudentImpl studentService = new ServerStudentImplService().getServerStudentImplPort();
    static private String uName = new String();
    static private String uSurname = new String();
    static private String uPatr = new String();
    static private Integer userId = null;
    static private HashMap<String, Integer> worksMap = new HashMap<>();

    public static void main(String[] args) throws MalformedURLException{

        System.out.print("Your name: ");
        String name;
        try
        {
            DataInputStream inputStream = new DataInputStream(System.in);
            name = inputStream.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return;
        }

        String[] inputData = name.split(" ");

        uName = inputData[1];
        uSurname = inputData[0];
        uPatr = inputData[2];

        userId = (uName + uSurname + uPatr).hashCode();

        List<WorkRecord> upd = studentService.initConnection(uName, uSurname, uPatr);

        for(WorkRecord el: upd)
        {
            worksMap.put(el.getWorkName(), el.getWorkId());
        }

        System.out.println(worksMap);

        boolean exit = false;
        while(!exit)
        {
            System.out.println("--------------");
            System.out.println("Select action:");
            System.out.println("1: Add new file");
            System.out.println("2: Get marks");
            System.out.println("3: Check other works");
            System.out.println("4: Exit");
            System.out.println("--------------");

            Integer input = -1;

            try
            {
                String inputStr;
                DataInputStream inputStream = new DataInputStream(System.in);
                inputStr = inputStream.readLine();
                input = Integer.parseInt(inputStr);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            if (input > 0)
            {
                MenuPoints point = MenuPoints.values()[input];
                switch(point)
                {
                    case ADD_WORK_FILE:
                        addNewFile();
                        break;
                    case GET_MARK_FOR_WORK:
                        getMarks();
                        break;
                    case CHECK_WORK_FOR_OTHER:
                        checkOtherWorks();
                        break;
                    case EXIT:
                        exit = true;
                        break;
                    default:
                        break;
                }
            }

        }
    }

    private static void addNewFile()
    {
        String workName = null;
        System.out.println("Введите имя работы: ");
        try
        {
            DataInputStream inputStream = new DataInputStream(System.in);
            workName = inputStream.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        String path2work = null;
        String test1 = null;
        System.out.println("Где лежит файл с работой: ");
        try
        {
            DataInputStream inputStream = new DataInputStream(System.in);
            path2work = inputStream.readLine();
            test1 = Files.readString(Path.of(path2work));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        // String test = "Test work";

        if (workName != null && test1 != null)
        {
            byte[] arr = test1.getBytes();
            Integer id = studentService.loadWork(userId, workName, arr);
            worksMap.put(workName, id);
        }
    }
    private static void getMarks()
    {
        for (String name: worksMap.keySet())
        {
            Double mark = studentService.getMark(worksMap.get(name));
            System.out.println("For work: " + name + " mark is " + mark);
        }
    }
    private static void checkOtherWorks()
    {
        List<Integer> works = studentService.getWorksForCheck(userId);
        System.out.println(works);
        for (Integer work: works)
        {
            String workText = new String(studentService.downloadWork(work));
            System.out.println("Text:");
            System.out.println(workText);
            Integer mark = null;
            try
            {
                DataInputStream inputStream = new DataInputStream(System.in);
                mark = Integer.parseInt(inputStream.readLine());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            studentService.setMark(work, userId, mark);
        }
    }
}
