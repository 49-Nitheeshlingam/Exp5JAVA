/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

public class StudentManager {
    private Student[] students;
    private int studentCount;
    private int maxStudents;

    public StudentManager(int maxStudents) {
        this.maxStudents = maxStudents;
        students = new Student[maxStudents];
        studentCount = 0;
    }

    public void insertStudent(Student student) {
        if (studentCount < maxStudents) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Cannot add more students. Array is full.");
        }
    }

    public void removeStudent(int rollNo) {
        int indexToRemove = -1;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getRollNo() == rollNo) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < studentCount - 1; i++) {
                students[i] = students[i + 1];
            }
            students[studentCount - 1] = null;
            studentCount--;
            System.out.println("Student with roll number " + rollNo + " removed.");
        } else {
            System.out.println("Student with roll number " + rollNo + " not found.");
        }
    }

    public void displayStudentList() {
        for (int i = 0; i < studentCount; i++) {
            students[i].display();
        }
    }

    public void addStudent(Student student) {
        if (studentCount < maxStudents) {
            students[studentCount] = student;
            studentCount++;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Cannot add more students. Array is full.");
        }
    }
}
