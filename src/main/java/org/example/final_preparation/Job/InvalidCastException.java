package org.example.final_preparation.Job;

public class InvalidCastException extends RuntimeException{

    public InvalidCastException(String message){
        super(message);
    }
    public InvalidCastException(String message, Throwable cause){
        super(message, cause);
    }
}
