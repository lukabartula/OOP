package org.example.quiz_exercise;

public class task2 {
    public static void main(String[] args) {
        String sentence = "Cao ja sam Luka eo uzivam sta da vam recem";
        printWordFromSentence(sentence);
    }
    public static void printWordFromSentence (String sentence){
        String words[] = sentence.split(" ");
        for (String w : words){
            System.out.println(w);
        }
    }
}
