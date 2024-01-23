package org.example.final_preparation;



public class Run {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile("books.csv");
        GenerateReport.writeReport("books_report.csv", ReadFile.readFromFile("books.csv"));
    }
}
