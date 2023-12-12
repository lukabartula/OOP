package org.example.week10.lab.GradeAnalyzer;

import java.util.ArrayList;

public class GradeAnalyzer {
    private ArrayList<Integer> grades;

    public GradeAnalyzer(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public double printSum(){
        double sum = 0;
        for (Integer g: grades){
            sum+=g;
        }
        return sum;
    }

    public double calculateAvg(){
        double sum = printSum();
        return sum/grades.size();
    }
}
