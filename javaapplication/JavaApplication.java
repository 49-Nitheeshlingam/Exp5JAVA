/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

import studentmanagement.Student;
import studentmanagement.StudentManager;

import java.util.Scanner;

public class JavaApplication {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the maximum number of students: ");
        int maxStudents = obj.nextInt();
        StudentManager studentManager = new StudentManager(maxStudents);

        System.out.print("Enter the number of students: ");
        int n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name: ");
            String sname = obj.next();
            obj.nextLine();
            System.out.print("Enter rollno: ");
            int rollno = obj.nextInt();

            int[] grades = new int[5];
            System.out.println("Enter the Marks based on the 10's place as a whole number ");
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter Mark " + (j + 1) + ": ");
                grades[j] = obj.nextInt();
            }

            Student student = new Student(sname, rollno, grades);
            studentManager.insertStudent(student);
        }

        // Display student information
        System.out.println("\nStudent Information:");
        studentManager.displayStudentList();
        int addstud;
        System.out.print("\nEnter the no of students to add:");
        addstud = obj.nextInt();
        // Add a new student
        for(int i=0;i<addstud;i++){
        System.out.print("\nEnter the details of the student to add: ");
        System.out.print("\nEnter name: ");
        String sname = obj.next();
        obj.nextLine();
        System.out.print("Enter rollno: ");
        int rollno = obj.nextInt();

        int[] grades = new int[5];
        System.out.println("Enter the Marks based on the 10's place as a whole number ");
        for (int j = 0; j < 5; j++) {
            System.out.print("Enter Mark " + (j + 1) + ": ");
            grades[j] = obj.nextInt();
        }

        Student newStudent = new Student(sname, rollno, grades);
        studentManager.addStudent(newStudent);
        }
        // Display updated student information
        System.out.println("\nUpdated Student Information:");
        studentManager.displayStudentList();

        // Remove a student (for demonstration purposes)
        int removestud;
        System.out.print("\nEnter the no of students to remove:");
        removestud = obj.nextInt();
        // Add a new student
        for(int i=0;i<removestud;i++){
        if (n > 0) {
            System.out.print("\nEnter the roll number of the student to remove: ");
            int rollNumberToRemove = obj.nextInt();
            studentManager.removeStudent(rollNumberToRemove);

        }
            System.out.println("Updated Student Information:");
            studentManager.displayStudentList();
        }
    }
}
