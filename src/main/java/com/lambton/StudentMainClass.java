package com.lambton;

import java.util.Date;

public class StudentMainClass {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setData(777245,"Anmol","Singh",new Date(1997,10,15,12,22,22),
                Gender.Female,60);

        s1.printData();
//        new Date(setDate(););
    }
}
