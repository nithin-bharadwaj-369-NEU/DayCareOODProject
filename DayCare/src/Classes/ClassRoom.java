/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nithin Bharadwaj
 */
public class ClassRoom {
    
    private int capacity;
    private Person teacher;
    private String name;
    private List<Person> studentList = new ArrayList<>();

    public int getCapacity() {
        return capacity;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Person> studentList) {
        this.studentList = studentList;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ClassRoom(String name, Teacher headTeacher) {
        this.name = name;
        studentList = new ArrayList<>();
        this.teacher = headTeacher;
    }
    
}
