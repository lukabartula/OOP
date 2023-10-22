package org.example.quiz_exercise;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        countEvenOddZero(new int[] {1,2,3,45,6,6,65,4,3,0,0,0,0,453,44,523,4});
    }
    public static void countEvenOddZero (int arr[]){
        int even=0;
        int odd=0;
        int zero=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]%2==0 && arr[i]!=0){
                even++;
            }
            else if (arr[i]%2==1){
                odd++;
            }
            else {
                zero++;
            }
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
        System.out.println("zeros: " + zero);
    }
}
