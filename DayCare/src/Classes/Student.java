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
    
    public Student(int id, Date dob, int age, String name, double gpa,
            String contactName, String emergencyPhone,
            Date mmrVacc1, Date mmrVacc2, Date varicella1, Date varicella2){
        super(id, dob, age, name, contactName, emergencyPhone,
                mmrVacc1, mmrVacc2, varicella1, varicella2);
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
