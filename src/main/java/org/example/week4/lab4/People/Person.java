package org.example.week4.lab4.People;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private String address;
    private int age;
    private String country;

    public Person(String name, String address, int age, String country) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString(){
        return this.name + "\n \t" + this.address;
    }


}
class Student extends Person {

    private int credits = 0;
    private int student_id;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, String address, int age, String country, int student_id) {
        super(name, address, age, country);
        this.student_id = student_id;

    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void study (){
        credits++;
    }

    public void addGrades(int i){
        if (i<0 || i>100){
            System.out.println("Not valid grade.");
        }
        else {
            grades.add(i);
        }
    }

    public void showGrades(){
        for (Integer g : grades){
            System.out.println(g);
        }
    }


    @Override
    public String toString (){
        return this.getName() + "\n \t" + getAddress() + "\n \t"  + this.credits + " credits";
    }

}

class Teacher extends Person{

    private int salary;

    public Teacher(String name, String address, int salary, int age, String country) {
        super(name, address, age, country);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString (){
        return this.getName() + "\n \t" + this.getAddress() + "\n \t" + "salary " + this.salary + " per month";
    }
}