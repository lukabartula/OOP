package org.example.quiz_exercise;

public class task6_1 {
    public boolean palindrome (String str){
        for (int i = 0, j = str.length() - 1; i < j; i++, j--){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        task6_1 dm = new task6_1();
        System.out.println(dm.palindrome("edhem"));
    }


}
