package org.example.week2.lab2;

import java.util.Random;
import java.util.Scanner;

public class exercise10 {
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = drawNumber();
        System.out.println("Guess the number: ");


        while (true){
            int guess = Integer.parseInt(reader.nextLine());
            if (number==guess){
                System.out.println("Congratulations!");
                break;
            }
            else if (number>guess){
                System.out.println("Number is greater.");
            }
            else {
                System.out.println("The number is lesser.");
            }
        }
    }
}
