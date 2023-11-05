package org.example.week5.lab.Boxes2;

import java.util.ArrayList;
import java.util.Collection;

class Thing {
    private double weight;
    private String name;

    public double weight(){
        return this.weight;
    }

    public String getName(){
        return this.name;
    }

    public Thing(String name, double weight){
        if (weight>=0){
            this.weight = weight;
        }
        else {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
    public Thing(String name) {
        this.name = name;
    }

}

abstract class Box {
    public abstract void add(Thing thing);

    public void add(Collection<Thing> things){
        for (Thing thing : things){
            add(thing);
        }
    }
    public abstract boolean isInTheBox (Thing thing);
}

class MaxWeightBox extends Box{
    private ArrayList<Thing> things = new ArrayList<>();
    private int maxWeight;
    private int weightInBox;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.weightInBox = 0;
    }
    @Override
    public void add(Thing thing){
        if (this.weightInBox < this.maxWeight) {
            this.weightInBox += thing.weight();
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing){
        for (Thing t : things){
            if (t.getName().equals(thing.getName())){
                return true;
            }
        }
        return false;
    }
}

class OneThingBox extends Box{
        private ArrayList<Thing> things = new ArrayList<>();
        public OneThingBox() {

        }
        public void add(Thing thing){
            if(this.things.size()<1){
                things.add(thing);
            }
        }

        @Override
        public boolean isInTheBox(Thing thing){
            for (Thing t : things) {
                if (t.getName().equals(thing.getName())) {
                    return true;
                }
            }
            return false;
        }
}

class BlackHoleBox extends Box{
    private ArrayList<Thing> things = new ArrayList<>();
    public BlackHoleBox(){

    }
    public void add(Thing thing){
        things.add(thing);
    }
    @Override
    public boolean isInTheBox(Thing thing){
        return false;
    }
}



