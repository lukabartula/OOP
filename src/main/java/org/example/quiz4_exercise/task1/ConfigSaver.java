package org.example.quiz4_exercise.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class ConfigSaver {

    public static void saveConfigurableFields(String filename, Settings settings) throws IOException, IllegalAccessException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        Field[] fields = settings.getClass().getDeclaredFields();
        for (Field field : fields){
            field.setAccessible(true);
            if(field.isAnnotationPresent(ConfigurableField.class)){
                writer.write(field.getName()+"="+field.get(settings));
                writer.newLine();
            }
        }
        writer.close();
    }
}
