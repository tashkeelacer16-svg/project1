package Basics;

class Student {
String name = "taskeel" ;
int rollNo = 44;
float  marks= 65.7f;
int age = 21;
public static void main(String[]args){

    Student s = new Student();

    s.name="tashkeel";
    s.rollNo=44;
    s.marks=65.7f;
    s.age=21;

    System.out.println("Student Name : "+s.name);
    System.out.println("Student Roll No : "+s.rollNo);
    System.out.println("Student Marks : "+s.marks);
    System.out.println("Student Age : "+s.age);

}

}
