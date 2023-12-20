package org.example.quiz4_exercise.Reflection;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @ImportantAnnotation
    public static void meow(){
        System.out.println("meow.");
    }

    @ImportantAnnotation
    private void purr (){
        System.out.println("prrr");
    }
}
