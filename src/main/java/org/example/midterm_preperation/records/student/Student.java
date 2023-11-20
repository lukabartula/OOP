package org.example.midterm_preperation.records.student;

// Define a record named Student with the following attributes:
//  studentId (int), name (String), grade (double). Now, create a class
//   named StudentAnalyzer with a method named findAverageGrade, which
//   accepts a list of students and calculates the average grade.


import java.util.Arrays;
import java.util.List;

record Student(int student_id, String name, double grade) {}

class StudentAnalyzer {

    public static double avgGrade(List<Student> students){
        double sum =  students.stream()
                .mapToDouble(s -> s.grade())
                .sum();
        return sum/students.size();
    }
}

class RunCode{
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(111, "Iman Arifhodžic", 10),
                new Student(222, "Mirna Ljiljić", 9),
                new Student(333, "Luka Bartula", 7.5),
                new Student(444, "Salih Rogo", 9.8),
                new Student(555, "Edhem Rogo", 8.9)
        );

        System.out.println(
                "Average grade of students: " + (StudentAnalyzer.avgGrade(students)));
    }
}
