package org.example.lab1;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type first number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type second number: ");
        int b = Integer.parseInt(reader.nextLine());

        if (a>b){
            System.out.println("Greater number: " + a);
        }
        else if (a<b){
            System.out.println("Greater number: " + b);
        }
        else{
            System.out.println("Numbers are equal.");
        }
    }
}
