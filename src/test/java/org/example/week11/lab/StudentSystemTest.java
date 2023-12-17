package org.example.week11.lab;

import org.example.week11.lab.Exceptions.EmptyStudentListException;
import org.example.week11.lab.Exceptions.StudentNotFoundException;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentSystemTest {
    @Test
    void testIfStudentPresent(){
        StudentSystem studentSystem = new StudentSystem("students.csv");
        assertNotNull(studentSystem.getStudents());
    }

    @Test
    void testStudentWithId100(){
        StudentSystem studentSystem = new StudentSystem("students.csv");
        assertFalse(studentSystem.getStudentById(100)==null);
    }

    @Test
    void testStudentNull(){
        StudentSystem studentSystem = new StudentSystem("students.csv");
        assertNotNull(studentSystem.getStudents());
    }

    @Test
    void testHighestGPAStudent(){
        StudentSystem studentSystem = new StudentSystem("students.csv");
        assertEquals(9.8, studentSystem.getHighestGPAStudent().getGpa());
    }

    @Test
    void testExceptionForEmptyStudentList(){  //???????????????????????????????????????????????????????
        StudentSystem studentSystem = new StudentSystem("emptycsvFile.csv");
        assertThrows(EmptyStudentListException.class, studentSystem::getHighestGPAStudent);
    }

    @Test
    void testNamesArray(){
        StudentSystem studentSystem = new StudentSystem("students.csv");
        List<String> actualNames = studentSystem.getStudents().stream()
                .limit(5)
                .map(Student::getName)
                .toList();

        List<String> expectedNames = List.of("Camila Wood",
                                            "Alexander Thompson",
                                            "Liam Taylor", "Evelyn Jenkins",
                                            "Michael Jackson");
        assertEquals(expectedNames, actualNames);
    }

    @Test
    void testSize(){
        StudentSystem studentSystem = new StudentSystem("students.csv");

        assertEquals(70, studentSystem.getStudents().size());
    }

    @Test
    void testLargestName(){
        StudentSystem studentSystem = new StudentSystem("students.csv");


        Student largestNameStudent;
        try {
            largestNameStudent = studentSystem.getLongestNameStudent();
        } catch (EmptyStudentListException e) {
            largestNameStudent = null;
        }

        String expectedName = "Benjamin Richardson";
        assertEquals(expectedName, largestNameStudent != null ? largestNameStudent.getName() : null);
    }

    @Test
    void testStudents(){
        StudentSystem studentSystem = new StudentSystem("students.csv");

        Student highestGPAStudent;
        try {
            highestGPAStudent = studentSystem.getHighestGPAStudent();
        } catch (EmptyStudentListException e) {
            highestGPAStudent = null;
        }

        Student longestNameStudent;
        try {
            longestNameStudent = studentSystem.getLongestNameStudent();
        } catch (EmptyStudentListException e) {
            longestNameStudent = null;
        }

        assertNotSame(highestGPAStudent, longestNameStudent);
    }

    @Test
    void testSameStudent(){
        StudentSystem studentSystem = new StudentSystem("students.csv");

        Student highestGPAStudent;
        try {
            highestGPAStudent = studentSystem.getHighestGPAStudent();
        } catch (EmptyStudentListException e) {
            highestGPAStudent = null;
        }

        Optional<Student> studentWithId12;
        try {
            studentWithId12 = studentSystem.getStudentById(100);
            if (studentWithId12.isPresent()) {
                throw new StudentNotFoundException("Not found.");
            }
        }
        catch (StudentNotFoundException e){
            throw new RuntimeException();
        }

        assertNotSame(studentWithId12.orElse(null), highestGPAStudent);
    }
}