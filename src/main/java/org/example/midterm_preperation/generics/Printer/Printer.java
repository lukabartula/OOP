package org.example.midterm_preperation.generics.Printer;

class Wolf{
    private String sound;

    public Wolf(String sound) {
        this.sound = sound;
    }
    @Override
    public String toString(){
        return this.sound;
    }
}

class Printer <T, K extends Wolf>{
    private T thingToPrint;
    private K otherThing;

    public Printer(T thingToPrint, K otherThing) {
        this.thingToPrint = thingToPrint;
        this.otherThing = otherThing;
    }

    @Override
    public String toString(){
        return this.thingToPrint + ", " + otherThing;
    }
}

class Test {
    public static void main(String[] args) {

        Printer p = new Printer(22, new Wolf("wuuu"));
        System.out.println(p);
    }
}