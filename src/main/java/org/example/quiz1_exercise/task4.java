package org.example.quiz1_exercise;

public class task4 {
    public static void main(String[] args) {
        System.out.println(baseRaisedToPower(2,10));
    }
    public static int baseRaisedToPower (int base, int power){
        int result = 1;
        for (int i=0; i<power; i++){
            result*=base;
        }
        return result;
    }
}
