package org.example.week6.lab.exercise7;

import java.util.Random;

public class NightSky {
    private double density;
    private int height;
    private int width;
    private int starsInTheLastPrint;

    public NightSky(double density, int height, int width) {
        this.density = density;
        this.height = height;
        this.width = width;
    }

    public NightSky(int width, int height){
        this.width = width;
        this.height = height;
        this.density=0.1;
    }

    public NightSky(double density) {
        this.density = density;
        this.height = 10;
        this.width = 20;
    }


    public void printLine(){
        this.starsInTheLastPrint = 0;
        Random random = new Random();
        for(int i=0; i<this.width; i++){
            if (random.nextDouble()<=this.density){
                System.out.print("*");
                this.starsInTheLastPrint++;
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public void print(){
        int totalStars=0;
        for (int i=0; i<this.height; i++){
            printLine();
            totalStars+=this.starsInTheLastPrint;
        }
        this.starsInTheLastPrint = totalStars;
    }
    public int starsInTheLastPrint (){
        return this.starsInTheLastPrint;
    }
}

class Main {
    public static void main(String[] args) {
        NightSky nightSky = new NightSky(0.1, 10, 40);
        //nightSky.printLine();

        NightSky nightSky1 = new NightSky(8, 4);
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInTheLastPrint());
        System.out.println();

        nightSky1.print();
        System.out.println("Number of stars: " + nightSky1.starsInTheLastPrint());
    }
}
