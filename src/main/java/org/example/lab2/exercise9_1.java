package org.example.lab2;

public class exercise9_1 {

    private static void drawNumbersPyramid(int rows){
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        drawNumbersPyramid(5);
    }
}
