package org.example.week6.lab.exercise6;

public class exercise6 {
    public static void printElegantly(int[] arr){
        for (int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]);
            if(arr[i]!=arr[arr.length-1]){
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 1, 3, 4, 2 };
        printElegantly(array);
    }
}
