package org.example.lab1;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        int sum = num1 + num2;
        System.out.println("Sum of the numbers is: " + sum);
    }
}
