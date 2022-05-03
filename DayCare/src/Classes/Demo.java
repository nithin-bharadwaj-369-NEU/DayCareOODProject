/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Classes.School.studentlist;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Nithin Bharadwaj
 */
public class Demo {
    
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
        
    }
}
