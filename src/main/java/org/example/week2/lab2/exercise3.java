package org.example.week2.lab2;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter numbers for sum, enter 0 and the summation stops.");

        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read==0){
                break;
            }
            else{
                sum+=read;
            }
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum final: "+ sum);
    }
}
