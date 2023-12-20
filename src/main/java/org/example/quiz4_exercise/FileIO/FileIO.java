package org.example.quiz4_exercise.FileIO;

import java.io.*;


class WriterReader{
    public static void writeToFile(String message1, String message2){
        String[] names = {"Luka", "Iman", "Salih", "Edhem", "Emina", "Mirna", "Samira"};
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("someFIle.txt"));
                writer.write(message1);
                writer.write("\n" + message2);
                for (String name : names){
                    writer.write("\n" + name);
                }
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
    }

    public static void readFile(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("someFile.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new FileNotFoundException("File not found.");
        }
    }
}

class FileIO {
    public static void main(String[] args) {
        WriterReader.writeToFile("Line1 lalalala", "Line 2 lalalalala");
        WriterReader.readFile();
    }
}
