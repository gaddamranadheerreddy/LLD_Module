package com.scalar.lldmodule.DesignPatterns.Prototype;

public class Student implements prototype<Student>{
    private String name;
    private int age;
    private String university;
    private double psp;

    //Default Constructor
    public Student(){}

    //Constructor
    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.university = student.university;
        this.psp = student.psp;

    }

    //Copy method
    @Override
    public Student copy() {
        return new Student(this);
    }

    //Setters -> Shortcut -> Alt + Insert -> In windows.

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }
}
