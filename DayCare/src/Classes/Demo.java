/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Classes.School.studentlist;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nithin Bharadwaj
 */
public class Demo {
    
    public static final Map<String, Integer> studentRatioRules = new HashMap<>(){};

    static{
        studentRatioRules.put("6-12", 4);
        studentRatioRules.put("13-24", 5);
        studentRatioRules.put("25-35", 6);
        studentRatioRules.put("36-47", 8);
        studentRatioRules.put("48-59", 12);
        studentRatioRules.put("60-Above", 15);
    }
    
    
    public void run(){
        School schoolInstance = School.getInstance();
        Path relativePathToDumpFile = Paths.get("", "src", "Resources", "Students.csv");
        String studentCsvFile = relativePathToDumpFile.toAbsolutePath().toString();
        StudentFactory.getInstance().addObject(studentCsvFile);
        schoolInstance.viewStudentInformation();
                

        Path teacherPathToDumpFile = Paths.get("", "src", "Resources", "Teachers.csv");
        String teacherCsvFile = teacherPathToDumpFile.toAbsolutePath().toString();
        TeacherFactory.getInstance().addObject(teacherCsvFile);
        schoolInstance.viewTeacherInformation();
        
        System.out.println("*** Creating groups with teachers and stundets **** ");
        
        List<Student> studentList = schoolInstance.getStudentlist();
        List<Teacher> teacherList = schoolInstance.getTeacherlist();
        
        int getClassRooms = this.getNumberOfClassesToCreate(studentList, teacherList);
        System.out.println("*** Total Classrooms to Create : " + getClassRooms);
        while(getClassRooms > 0){
            schoolInstance.addClassRoom(new ClassRoom("Class_" + getClassRooms));
            getClassRooms--;
        }
        System.out.println("*** Created New Classroom Successfully");
        
        System.out.println("*** Creating Groups for Teachers and Students");
        
    }
    
    
    public void createGroups(School instance){
        
        
        
    }
    
    
    public int getNumberOfClassesToCreate(List<Student> studentList, 
                   List<Teacher> teacherList){
        Map<String, Integer> studentDistribution = getAgeDistribution(studentList);

        Map<String, Integer> groupDistribution = this.getGroupsDistribution(studentDistribution);

        int totalStudents = 0;

        for (Map.Entry entry : groupDistribution.entrySet()) { 
          String key = entry.getKey().toString();
          int groupSize = Integer.parseInt(entry.getValue().toString());
          int expectedGroupSize = Integer.parseInt(studentRatioRules.get(key).toString()); 
          // do whatever with value1 and value2 
          totalStudents = (groupSize * expectedGroupSize);
        }
        int totalClassrooms = totalStudents / 30;
        totalClassrooms++;
        return totalClassrooms;
        
    }
    
    
    
    public Map<String, Integer> getAgeDistribution(List<Student> studentList){
        Map<String, Integer> studentDistribution = new HashMap<String, Integer>();
        for(Student pk : studentList){
            if (studentDistribution.containsKey(pk.getAgeGroup())) {

                studentDistribution.put(pk.getAgeGroup(),
                        studentDistribution.get(pk.getAgeGroup()) + 1);
            }
            else {
 
                studentDistribution.put(pk.getAgeGroup(), 1);
            }
            
        }
        return studentDistribution;
    }
    
    public Map<String, Integer> getGroupsDistribution(Map<String, Integer> studentDistribution){
        Map<String, Integer> groupDistribution = new HashMap<String, Integer>();
        
        for (Map.Entry entry : studentDistribution.entrySet()) {
            int maxSize = studentRatioRules.get(entry.getKey());
            System.out.println("Processing for Key : " + entry.getKey());
                groupDistribution.put(entry.getKey().toString(),
                     1 + (Integer.parseInt(entry.getValue().toString())/ maxSize));   
        }
        return groupDistribution;
    }
    
}
