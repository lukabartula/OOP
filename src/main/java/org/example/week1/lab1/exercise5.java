package org.example.week1.lab1;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (number>0){
            System.out.println("The number is positive.");
        }
        else if(number<0){
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is zero.");
        }
    }
}
