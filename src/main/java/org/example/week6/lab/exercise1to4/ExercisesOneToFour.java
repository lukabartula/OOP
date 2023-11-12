package org.example.week6.lab.exercise1to4;


public class ExercisesOneToFour {
    //exercise 1
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i=0; i<array.length; i++){
            if(array[i]<smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    //exercise 2
    public static int indexOfTheSmallest(int[] array){
        int smallest = array[0];
        int smallestInd = 0;
        for (int i=0; i<array.length; i++){
            if(array[i]<smallest){
                smallest = array[i];
                smallestInd = i;
            }
        }
        return smallestInd;
    }

    //exercise 3
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallest = array[0];
        int smallestInd = index;
        for (int i=index; i<array.length; i++){
            if(array[i]<smallest){
                smallest = array[i];
                smallestInd = i;
            }
        }
        return smallestInd;
    }

    //exercise 4
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    public static void main(String[] args) {
        //exercise 1 main
        /*int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));*/

        //exercise 2 main
        /*int[] values = {6, 5, 8, 7, 11};
        System.out.println("index od the smallest: " + indexOfTheSmallest(values));*/

        //exercise 3 main
        /*int[] values = {6, 5, 8, 7, 11};
        System.out.println("index od the smallest: " + indexOfTheSmallestStartingFrom(values,1));
        System.out.println("index od the smallest: " + indexOfTheSmallestStartingFrom(values,2));
        System.out.println("index od the smallest: " + indexOfTheSmallestStartingFrom(values,4));*/

        //exercise 4 main
        /*int[] values = {3, 2, 5 ,4 ,8};
        System.out.println(Arrays.toString(values));

        swap(values,1,0);
        System.out.println(Arrays.toString(values));
        swap(values, 0, 3);
        System.out.println(Arrays.toString(values));*/


    }

}

