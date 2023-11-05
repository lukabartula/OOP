package org.example.quiz1_exercise;

public class task5 {
    public static void main(String[] args) {
        printTablesNumber(1,5,6);
    }
    public static void printTablesNumber(int start, int end, int number){
        int result=1;
        for(int i=start; i<=end; i++){
            result=i*number;
            System.out.println(i + " * " + number + " = " + result);
        }
    }
}
