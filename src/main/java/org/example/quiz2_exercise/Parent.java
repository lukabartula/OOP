package org.example.quiz2_exercise;

import java.util.Date;

class Main {
    public static void main(String[] args) {
        Child Mustafa = new Child("Mule", 21, "plumber", 3);
        System.out.println(Mustafa);
    }
}

class Parent {
    private String name;
    private int age;
    private String occupation;

    public Parent (String name, int age, String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getOccupation(){
        return this.occupation;
    }
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    @Override
    public String toString(){
        return this.name + " " + this.age + " " + this.occupation;
    }
}

class Child extends Parent {
    private int grade;

    public Child (String name, int age, String occupation, int grade){
        super(name, age, occupation);
        this.grade = grade;
    }

    public int getGrade(){
        return grade;
    }
    public void setGrade (int grade){
        this.grade = grade;
    }

    @Override
    public String toString (){
        return this.getName() + " " + this.getAge() +  " " + this.getOccupation() + " "  + this.grade;
    }
}