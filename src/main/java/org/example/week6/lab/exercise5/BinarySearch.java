package org.example.week6.lab.exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static boolean search (int[] array, int x){
        int left = 0, right = array.length-1;
        while (left<=right){
            int mid = left + (right - left) / 2;
            if (array[mid] == x){
                return true;
            }
            if (array[mid]<x){
                left = mid + 1;
            }
            else {
                right = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //Testing binary search
        int[] array = { -3, 2, 3, 4, 7, 8, 12 };
        Scanner reader = new Scanner(System.in);

        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.println("Enter your searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
        System.out.println((result) ? ("Value " + searchedValue + " is in the array") : ("Value " + searchedValue + " is not in the array"));
    }
}
