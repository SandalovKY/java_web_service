package ru.mywebapp;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;

import server.generated.teacher.ServerTeacherImpl;
import server.generated.teacher.ServerTeacherImplService;
import server.generated.teacher.WorkRecord;
import server.generated.teacher.RecordImpl;

public class TeacherClient
{
    static enum MenuPoints
    {
        DEFAULT,
        GET_ALL_WORKS,
        EXIT
    }
    static enum WorkActions
    {
        DEFAULT,
        LOAD,
        ALL_MARKS,
        AVERAGE,
        EXIT
    }
    static private ServerTeacherImpl teacherService = new ServerTeacherImplService().getServerTeacherImplPort();

    public static void main(String[] args)
    {
        boolean exit = false;
        while(!exit)
        {
            System.out.println("--------------");
            System.out.println("Select action:");
            System.out.println("1: Get all works");
            System.out.println("2: Exit");
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
                    case GET_ALL_WORKS:
                        getAllWorks();
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

    private static void getAllWorks()
    {
        List<WorkRecord> allWorks = teacherService.getAllWorks();
        Integer i = 1;
        for (WorkRecord record: allWorks)
        {
            System.out.println(i + ") " + record.getWorkName() + "[" + record.getWorkId() + "]" + " ( " + record.getName() + " " + record.getSurname() +" )");
            ++i;
        }
        System.out.print("Select work:");
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
        if (input > 0 && input <= allWorks.size())
        {
            boolean exit = false;
            while (!exit)
            {
                System.out.println("--------------");
                System.out.println("Select action:");
                System.out.println("1) Load work");
                System.out.println("2) Check marks");
                System.out.println("3) Get average mark");
                System.out.println("4) Exit");
                System.out.println("--------------");
                Integer menu = -1;
                try
                {
                    String inputStr;
                    DataInputStream inputStream = new DataInputStream(System.in);
                    inputStr = inputStream.readLine();
                    menu = Integer.parseInt(inputStr);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                if (menu > 0)
                {
                    WorkActions point = WorkActions.values()[menu];
                    Integer workId = allWorks.get(input - 1).getWorkId();
                    switch(point)
                    {
                        case LOAD:
                            loadWork(workId);
                            break;
                        case ALL_MARKS:
                            getAllMarks(workId);
                            break;
                        case AVERAGE:
                            getAverage(workId);
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
    }

    private static void loadWork(Integer workId)
    {
        String text = new String(teacherService.downloadWork(workId));
        System.out.println("Text:");
        System.out.println(text);
    }
    private static void getAverage(Integer workId)
    {
        Double aver = teacherService.getMark(workId);
        System.out.println("Average mark: " + aver);
    }
    private static void getAllMarks(Integer workId)
    {
        System.out.println("All marks for work");
        List<RecordImpl> marks = teacherService.getAllMarks(workId);
        for (RecordImpl mark: marks)
        {
            System.out.println(mark.getMName() + " " + mark.getMSurname() + " " + mark.getMPatr() + " mark: " + mark.getMMark());
        }
    }
}
