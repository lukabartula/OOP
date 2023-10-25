package org.example.week1.lecture1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class classCalculator {
    public static void main(String[] args) {
        while (true){
            List<String> choices = Arrays.asList("sum", "difference", "quit");
            Scanner reader = new Scanner(System.in);
            System.out.print("Please enter one of the choices (sum, difference, quit): ");
            String userChoice = reader.nextLine();

            if (choices.contains(userChoice)){
                if (userChoice.equals("quit")){
                    System.out.println("Goodbye!");
                    break;
                }
                System.out.println("Enter first number: ");
                int a = reader.nextInt();

                System.out.println("Enter second number: ");
                int b = reader.nextInt();

                if (userChoice.equals("sum")){
                    System.out.println("The result is: " + (a + b));
                    break;
                }

                System.out.println("The result is: " + (a+b));
                break;
            }
        }
    }
}
