package org.example.quiz1_exercise;

public class task3 {
    public static void main(String[] args) {
        invertedPyramid(5);
    }
    public static void invertedPyramid (int rows){
        for (int i=rows; i>=1; i--){
            for (int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
