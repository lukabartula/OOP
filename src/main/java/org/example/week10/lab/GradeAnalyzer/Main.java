package org.example.week10.lab.GradeAnalyzer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        ArrayList<Integer> newGrades = new ArrayList<>();
        newGrades.add(8);

        Student student = new Student("Salih", 111, newGrades);
        System.out.println(student.getGrades());
        student.setGrade(9);
        student.setGrade(7);
        System.out.println(student.getGrades());

        //reflection
        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(student.getGrades());
        Class<?> gradeAnalyzerClass = gradeAnalyzer.getClass();
        Field[] fields = gradeAnalyzerClass.getDeclaredFields();
        for (Field f : fields) {
            System.out.println("Fields and values:");
            System.out.println(f.getName());
        }


        Method[] methods = gradeAnalyzerClass.getDeclaredMethods();
        System.out.println("Method names and results");

        for (Method m : methods) {
            if (m.getName().startsWith("calculate") || m.getName().startsWith("print")) {
                Object result = m.invoke(gradeAnalyzer);
                System.out.println(m.getName() + ": " + result);
            }
        }
    }
}
