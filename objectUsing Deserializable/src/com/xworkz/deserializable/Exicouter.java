package com.xworkz.deserializable;

import com.xworkz.deserializable.student.Student;

import java.io.*;

import static java.awt.SystemColor.text;

public class Exicouter {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Student std = new Student();
        std.clg=23;
        System.out.println(std.clg);

        System.out.println("*******************************************");

//        FileOutputStream fos= new FileOutputStream("text.txt");
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//        Student s1=new Student();
//        oos.writeObject(s1);
        FileInputStream fis=new FileInputStream("text.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student s2= (Student)ois.readObject();
        System.out.println(s2);
        s2.clg=23;
        System.out.println(s2.clg);
    }

}
