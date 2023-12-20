package org.example.quiz4_exercise.task1;


import java.io.IOException;

/*
You are working on a Java project where you need to introduce a simple
mechanism for marking certain fields as "configurable."
Create a custom exception named MyConfigException that extends the appropriate base exception class.
Use this custom exception to handle any errors that may occur during the following program.
Define a custom annotation named ConfigurableField that can be applied to fields in a Java class.
Create a class called Settings with the following fields username, password, and timeout.
Apply the custom annotation to username and password only.
Implement a method named saveConfigurableFields in a separate class named ConfigSaver.
This method should take an object and use reflection to save the names of the fields annotated
with ConfigurableField into a file passed in the filename parameter in the format fieldname=fieldvalue
(repeat this for each field).
Write a test to confirm that the code in the main method has 2 written lines of code after execution.
*/
public class Quiz {
    public static void main(String[] args) throws IOException, MyConfigException, IllegalAccessException {
        String filename = "data.txt";
        Settings settings = new Settings();
        settings.setUsername("user123");
        settings.setPassword("pass456");
        settings.setTimeout(30);
        ConfigSaver.saveConfigurableFields(filename, settings);
    }
}
