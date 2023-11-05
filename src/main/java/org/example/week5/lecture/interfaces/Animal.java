package org.example.week5.lecture.interfaces;

abstract class Animal {
    private String name;
    private int age;

    public Animal(){}

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract String makeSound();

    public String sayMyNameLoud(){
        return "LOUD NAME IS " + this.name;
    }
}

class Dog extends Animal implements Ability{

    @Override
    public String makeSound(){
        return "Ruf ruf";
    }

    @Override
    public void play() {
        System.out.println("I play with ball.");
    }

    @Override
    public String sayMyNameLoud(){
        return "MY LOUD NAME IS " + this.getName();
    }
}

class Cat extends Animal implements Ability{

    @Override
    public void play(){
        System.out.println("I play with yarn.");
    }

    @Override
    public String makeSound() {
        return "ROOOOOOAAAARRR";
    }
}

interface Ability {
    int age = 1;
    public void play();
}
