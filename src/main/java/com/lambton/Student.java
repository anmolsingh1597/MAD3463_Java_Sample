package com.lambton;

import java.util.Date;
enum Gender{
    Male,
    Female,
    Other
}
public class Student {
    int studentId;              //class level attribute
    String firstName;
    String lastName;
    Date birthDate;
    Gender gender;
    float totalMarks;

    public void setData(int studentId,String firstName, String lastName, Date birthDate, Gender gender, float totalMarks)  //local attributes
    {
        this.studentId=studentId; //this keyword helps in linking
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.gender=gender;
        this.totalMarks=totalMarks;
    }

    public void printData(){
        System.out.println("Student ID: "+studentId);
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: " +lastName);
        System.out.println("Birth Date: "+birthDate);
        System.out.println("Gender: "+gender);
        System.out.println("Total Marks: "+totalMarks);
    }
    

}
