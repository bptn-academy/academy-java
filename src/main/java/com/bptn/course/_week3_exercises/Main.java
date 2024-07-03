package com.bptn.course._week3_exercises;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Start by looking in the University and Student classes. Implement the methods. 

        // Create a bunch of student objects 
        Student student1 = new Student(123, "testUsername1", "password1", "John", "Doe", "john.doe@example.com",
                "1234567890", "123 Main St", "Male", new Date(), new Date(),
                101, "Computer Science");
       Student student2 = new Student(124, "testUsername2", "password2", "Jane", "Smith", "jane.smith@example.com",
                "9876543210", "456 Oak Ave", "Female", new Date(), new Date(),
                102, "Engineering");
            // (Make sure one student has the following studentId: 123)
            // (Make sure one other student has the following username: testUsername1)

        // Create instance of university called "university" and populate it with the students.
       University university = new University();
       
       university.addStudent(student1);
       university.addStudent(student2);


        System.out.println("\nUniversity ------ \n" + university.deleteStudent(124));
        System.out.println("\nGetting student------\n" + university.getStudent(123));
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
        System.out.println("\nSeaching student------\n" + university.searchStudent("A"));



    }
}
