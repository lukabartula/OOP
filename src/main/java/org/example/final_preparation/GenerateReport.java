package org.example.final_preparation;

import java.io.*;
import java.lang.reflect.Field;
import java.util.List;

public class GenerateReport {
    public static void writeReport(String outputFilename, List<Item> items){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename));

            Class<?> clazz = Item.class;
            Field[] fields = clazz.getDeclaredFields();

            for (Item item : items){
                String temp = "";
                for (Field field : fields){
                    if (field.isAnnotationPresent(WritableField.class)) {
                        field.setAccessible(true);
                        temp = temp.concat(field.get(item).toString()).concat(",");
                    }
                }
                writer.write(temp.substring(0,temp.length()-1).concat("\n"));

            }
            writer.close();
        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
