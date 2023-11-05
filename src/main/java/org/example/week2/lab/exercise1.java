package org.example.week2.lab;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String pass = "drakula";
        while (true){
            System.out.println("Type the password: ");
            String att = reader.nextLine();
            if (pass.equals(att)){
                System.out.println("Right!");
                System.out.println("The secret is: ne znam");
                break;
            }
            else {
                System.out.println("Wrong!");
            }
        }
    }
}
