package org.example.week5.lecture.polymorphism;

enum Type {
    ADDITION, SUBTRACTION
}
class Operation {
    private Type type;
    private String name;

    public Operation(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String whatDoIdo (){
        return "I do operations";
    }
}

class Addition extends Operation{
    public Addition(Type type, String name) {
        super(type, name);
    }

    @Override
    public String whatDoIdo(){
        return "I do addition";
    }
}

class Subtraction extends Operation{
    public Subtraction(Type type, String name){
        super(type, name);
    }
    @Override
    public String whatDoIdo(){
        return "I do subtraction";
    }
}
//unfinished, missing downcasting and upcasting






