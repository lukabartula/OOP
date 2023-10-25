package org.example.week2.lab2;

public class exercise8_1 {
    private static void drawStarsPyramid(int rows){

        for (int i=1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        drawStarsPyramid(5);
    }
}
