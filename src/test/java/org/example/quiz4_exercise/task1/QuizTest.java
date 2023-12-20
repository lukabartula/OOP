package org.example.quiz4_exercise.task1;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {
    @Test
    void LinesEqualTo2 () throws IOException {
        int counter = 0;
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        String tempLine;
        while((tempLine= reader.readLine())!=null){
            System.out.println(tempLine);
            counter++;
        }
        reader.close();
        assertEquals(2,counter);
    }
}