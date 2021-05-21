package com.Lee;
class Student{
    int id;
    String name;
}
 public class Main{

    public static void main(String[] args) {
	// write your code here
        Student s1=new Student();
        Student s2=new Student();
        s1.id=101;
        s1.name="Lisa";
        s2.id=102;
        s2.name="Mona";
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);


    }
}
