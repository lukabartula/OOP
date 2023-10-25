package org.example.week3.lab3;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DbConnect db = new DbConnect();

        try {
            db.getAllTasks();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
