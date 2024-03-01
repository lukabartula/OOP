package org.example.final_preparation.Job;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class CustomFileWriter {
    public static void writeReport(String outputFilename, List<Job> jobs){

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename));

            Class<?> clazz = Job.class;
            Field[] fields = clazz.getDeclaredFields();

            for (Field f : fields){
                String temp = "";
                if(f.isAnnotationPresent(WriteFormat.class)){
                    f.setAccessible(true);
                    
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
