package org.example.week11.lab.Exceptions;

public class EmptyStudentListException extends RuntimeException{
    public EmptyStudentListException(String message){
        super(message);
    }
}
