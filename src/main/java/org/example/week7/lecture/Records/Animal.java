package org.example.week7.lecture.Records;

import java.util.Objects;
import java.util.SimpleTimeZone;


record AnimalRecord(String name,int age, int numOfLegs){};
class Animal {
    private final String name;
    private final int age;
    private final int numOFLegs;

    public Animal(String name, int age, int numOFLegs) {
        this.name = name;
        this.age = age;
        this.numOFLegs = numOFLegs;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumOFLegs() {
        return numOFLegs;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.age, this.numOFLegs);
    }

    @Override
    public String toString(){
        return "Person (name: " + this.name + ", age: " + this.age + ", num of legs: " + this.numOFLegs;
    }

    @Override
    public boolean equals(Object object){
        if(object == null)
            return false;
        Animal a = (Animal) object;
        return this.name.equals(a.getName()) && this.age == a.getAge() && this.numOFLegs==(a.numOFLegs);
    }
}

class TestMyClass {
    public static void main(String[] args) {
        Animal a = new Animal("Spider", 3, 8);
        Animal a2 = new Animal("Cow", 9, 4);

        System.out.println(a.toString());
        System.out.println(a2.getName());

        AnimalRecord an = new AnimalRecord("Spider", 3, 8);
        AnimalRecord an2 = new AnimalRecord("Cow", 9, 4);

        System.out.println(an.toString());
        System.out.println(an.name());
    }
}