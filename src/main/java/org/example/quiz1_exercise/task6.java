package org.example.quiz1_exercise;

public class task6 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println((isPalindrome("nijePalindrom")));
        System.out.println(isPalindrome("anavolimilovana"));
    }
    public static boolean isPalindrome (String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

}
