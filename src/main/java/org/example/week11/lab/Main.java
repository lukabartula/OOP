package org.example.week11.lab;

import org.example.week11.lab.Exceptions.StudentNotFoundException;
import org.example.week11.lab.Exceptions.EmptyStudentListException;

public class Main {
    public static void main(String[] args) throws StudentNotFoundException {
        StudentSystem system = new StudentSystem("students.csv");

        /*for (Student s : system.getStudents()){
            System.out.println(s);
        }*/

        try {
            if (system.getStudentById(10).isPresent()){
                System.out.println(system.getStudentById(10).get().getName());
            }
            else {
                throw new StudentNotFoundException("Student not found.");
            }
        }
        catch (StudentNotFoundException e) {
            //System.out.println("Student not found.");   moze i ovako
            System.out.println(e.getMessage());
        }


        try {
            System.out.println(system.getHighestGPAStudent());
        }
        catch (EmptyStudentListException e){
            //System.out.println("List of students is empty."); moze i ovako, u metodi je passana ova poruka
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(system.getLongestNameStudent());
        }
        catch (EmptyStudentListException e){
            System.out.println(e.getMessage());
        }
    }
}
