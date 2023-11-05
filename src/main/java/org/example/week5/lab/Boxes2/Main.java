package org.example.week5.lab.Boxes2;

public class Main {
    public static void main(String[] args) {
        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", 5));
        coffeeBox.add(new Thing("Pirkka", 5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));
        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));

        OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));
        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));

        BlackHoleBox blackBox = new BlackHoleBox();
        blackBox.add(new Thing("Saludo", 5));
        blackBox.add(new Thing("Pirkka", 5));
        System.out.println(blackBox.isInTheBox(new Thing("Saludo")));
        System.out.println(blackBox.isInTheBox(new Thing("Pirkka")));

        // Upcasting: Creating objects and assigning them to variables of type Box
        Box box1 = new MaxWeightBox(10);
        Box box2 = new OneThingBox();
        Box box3 = new BlackHoleBox();
        Box box4 = new MaxWeightBox(5);

        // Adding things to the boxes
        Thing thing1 = new Thing("Thing1", 3.0);
        Thing thing2 = new Thing("Thing2", 2.5);
        Thing thing3 = new Thing("Thing3", 1.0);
        box1.add(thing1);
        box2.add(thing2);
        box3.add(thing3);
        box4.add(thing1);

        // Downcasting cautiously using the instanceof operator
        if (box1 instanceof MaxWeightBox) {
            MaxWeightBox maxWeightBox1 = (MaxWeightBox) box1;
            System.out.println("Downcasted to MaxWeightBox: " + maxWeightBox1.isInTheBox(thing1));
        }

        if (box2 instanceof OneThingBox) {
            OneThingBox oneThingBox = (OneThingBox) box2;
            System.out.println("Downcasted to OneThingBox: " + oneThingBox.isInTheBox(thing2));
        }

        if (box3 instanceof BlackHoleBox) {
            BlackHoleBox blackHoleBox = (BlackHoleBox) box3;
            System.out.println("Downcasted to BlackHoleBox: " + blackHoleBox.isInTheBox(thing3));
        }

        if (box4 instanceof MaxWeightBox) {
            MaxWeightBox maxWeightBox2 = (MaxWeightBox) box4;
            System.out.println("Downcasted to MaxWeightBox: " + maxWeightBox2.isInTheBox(thing1));
        }
    }
}




