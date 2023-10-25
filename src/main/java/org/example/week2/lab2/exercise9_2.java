package org.example.week2.lab2;

public class exercise9_2 {

    private static void drawNumbersPyramid(int rows){
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        drawNumbersPyramid(5);
    }
}
