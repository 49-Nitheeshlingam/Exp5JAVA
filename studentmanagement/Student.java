/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

/**
 *
 * @author DELL
 */
public class Student {
    String sname;
    int rollno;
    int []grades;
    double grade1;
    public Student(String sname,int rollno,int grades[]){
        this.sname = sname;
        this.rollno = rollno;
        this.grades= grades;
        this.grade1=calAvg(this.grades);
 
    }
    private int calAvg(int grades[]){
         if (grades != null && grades.length > 0) {
        int sum =0;
        for( int grade1: grades){
            sum+=grade1;
        }
        return sum/5;
         }
         return 10;
    }
    public int getRollNo() {
        return rollno;
    }
    public void display(){
        String grade;
        System.out.println("Student name :"+sname);
        System.out.println("Rollno :"+rollno);
        if(this.grade1== 10)
            grade = "O";
        else if(this.grade1>=9)
            grade = "A+";
        else if(this.grade1 >=8)
            grade ="A";
        else if(this.grade1 >=7)
            grade = "B+";
        else if(this.grade1 >=6)
            grade ="B";
        else if(this.grade1 >=5)
            grade = "C+";
        else 
            grade = "F";
        System.out.println("Grade :"+grade);
        
    }
}
