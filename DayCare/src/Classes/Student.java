/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author Nithin Bharadwaj
 */
public class Student extends Person {
    
    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public Student(){
    
    }
    
    public Student(int id, Date dob, int age, String name, double gpa){
        super(id, dob, age, name);
        this.gpa = gpa;
    }
    
    
    public ClassRoom getClassroom() {
        return this.getClassroom();
    }
    
    @Override
    public String toString() {
        return getName();
    }
    
}
