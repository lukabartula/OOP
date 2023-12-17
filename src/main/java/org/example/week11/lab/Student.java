package org.example.week11.lab;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private String university;
    private String dept;
    private double gpa;

    public Student(int id, String name, String university, String dept, double gpa) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.dept = dept;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getDept() {
        return dept;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString(){
            return this.name;
    }
}


