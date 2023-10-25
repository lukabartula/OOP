package org.example.week2.lecture2;

import java.util.Scanner;

public class classAge {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(reader.nextLine());

        while (true){
            if (age<3 || age>125){
                System.out.println("You are a little liar.");
                if (age<3){
                    System.out.println("You can't type or read.");
                }
                else {
                    System.out.println("Go die!");
                }

                System.out.println("Enter your age again, this time without lying; ");
                age = Integer.parseInt(reader.nextLine());
                continue;
            }
            break;

        }
        System.out.println("You are " + age + " years old.");
    }
}
