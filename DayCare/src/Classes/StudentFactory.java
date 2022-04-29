/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Nithin Bharadwaj
 */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import utility.FileUtil;

public class StudentFactory {
    private static StudentFactory instance;

    private StudentFactory(){
        instance = null;
    }

    public static synchronized StudentFactory getInstance(){
        if(instance == null){
            instance = new StudentFactory();
        }
        return instance;
    }
    
    public static Person getObject(int id, Date dob, int age, String name, double gpa) {
        Student tmpstudent = new Student(id, dob, age, name, gpa);
        School.addStudent(tmpstudent);
        return tmpstudent;
    }

    public static List<Person> addObject(String csvFile) {
//        String[] fileOutput = csvFile.split("\\r?\\n");
	FileUtil fu = new FileUtil();
        System.out.println("Inside addObject method");
        List<String> fileOutput = fu.filereader(csvFile);
        Person tmpStudent = null;
        List<Person> tmplist = new ArrayList<>();
        for (String inputLine : fileOutput) {
            try{
//                System.out.println(inputLine);
                String[] values = inputLine.split(",");
                int id;
                try{
                    id =Integer.parseInt(values[0]);
                }catch(java.lang.NumberFormatException e){
                    id =Integer.parseInt(values[0].substring(1));
                }
                String dateOfBirthStr = values[1];
                Date dob = null;
                try{
                    dob = new SimpleDateFormat("dd-MM-yyyy").parse(dateOfBirthStr);
                }catch(Exception e){
                    System.err.println("Exception ocurred : " + e);
                }
                int age = Integer.parseInt(values[2]);
                String name = values[3];
                double gpa = Double.parseDouble(values[4]);
                tmpStudent = StudentFactory.getObject(id, dob, age, name, gpa);
//                System.out.println(tmpStudent.toString());
                tmplist.add(tmpStudent);
            }catch(Exception e){
                System.err.println("Exception ocurred : " + e);
                continue;
            }
            
        }
        return tmplist;
    }
}

