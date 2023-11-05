package org.example.week5.lab.Boxes1;


import java.util.ArrayList;

interface ToBeStored {
    double weight();
}

class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public double weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return this.writer + ": " + this.name;
    }
}

class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight=0.1;
    }

    public double weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return this.artist + ": " + this.title + " ("+ this.publishingYear + ")";
    }
}

class Box {
    private ArrayList<ToBeStored> things;
    private double maxWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing){
        if (maxWeight>thing.weight()){
            things.add(thing);
        }
    }

    public double totalWeight (){
        double total = 0;
        for (ToBeStored t : things){
            total+=t.weight();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Box: " + this.things.size() + " things, total weight " + this.totalWeight() + " kg";
    }
}




