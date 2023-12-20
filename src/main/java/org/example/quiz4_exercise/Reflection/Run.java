package org.example.quiz4_exercise.Reflection;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Run {
    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException{
        Cat myCat = new Cat("Cicko", 12);
        BufferedWriter writer = new BufferedWriter(new FileWriter("refleksijaVjezba.txt"));
        Method[] catMethods = myCat.getClass().getDeclaredMethods();

        for (Method method : catMethods){
            if(method.isAnnotationPresent(ImportantAnnotation.class)){
                method.setAccessible(true);
                writer.write(method.getName());
                writer.newLine();
            }
        }
        writer.close();


        try {
            BufferedReader reader = new BufferedReader(new FileReader("refleksijaVjezba.txt"));
            String line;
            while ((line = reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
