package org.example.week11.lab;

import org.example.week11.lab.Exceptions.EmptyStudentListException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentSystem {

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public StudentSystem(String filename) {
        try{
            this.students = new ArrayList<>();
            students = readFile(filename);
        } catch (IOException e) {
            this.students = new ArrayList<>();
            System.out.println("Unable to read from file.");
        }

    }

    private List<Student> readFile (String filename) throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        List<String> lines = bufferedReader.lines()
                .toList();
        for (String line : lines){
            String[] studentParts = line.split(",");
            Student s = new Student(Integer.parseInt(studentParts[0]),
                    studentParts[1],
                    studentParts[2],
                    studentParts[3],
                    Double.parseDouble(studentParts[4])
            );
            students.add(s);
        }

        bufferedReader.close();
        return students;
    }

    public Optional<Student> getStudentById(int id){
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst();
    }

    public Student getHighestGPAStudent() throws EmptyStudentListException{
        if (!this.students.isEmpty()){
            int indexOfMax = 0;
            double max = 0;
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getGpa() > max) {
                    max = students.get(i).getGpa();
                    indexOfMax = i;
                }
            }
            return students.get(indexOfMax);
        }
        else
            throw new EmptyStudentListException("List of students is empty.");
    }

    public Student getLongestNameStudent(){
        if (!this.students.isEmpty()){
            int longest = 0;
            int indexOfLongest = 0;
            for (int i = 0; i<students.size(); i++){
                if (students.get(i).getName().length() > longest){
                    longest = students.get(i).getName().length();
                    indexOfLongest = i;
                }
            }
            return students.get(indexOfLongest);
        }
        else
            throw new EmptyStudentListException("List of students is empty.");
    }
}


