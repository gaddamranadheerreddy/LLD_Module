package com.scalar.lldmodule.DesignPatterns.Prototype;

public class IntellijentStudent extends Student {
    private int iq;

    //Default constructor
    public IntellijentStudent() {}

    //Constructor
    public IntellijentStudent(IntellijentStudent student) {
        super(student); //getting the attributes from Parent class (Student class)
        //And setting them to child class.
        this.iq = student.iq;
    }

    //Copy method
    @Override
    public IntellijentStudent copy() {
        return new IntellijentStudent(this);
    }

    //Setters

    public void setIq(int iq) {
        this.iq = iq;
    }
}
