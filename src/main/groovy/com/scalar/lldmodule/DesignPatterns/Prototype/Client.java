package com.scalar.lldmodule.DesignPatterns.Prototype;

public class Client {
    private static void fillRegistry(StudentRegistry studentRegistry){

        Student student = new Student();
        student.setUniversity("Scaler Academy");
        studentRegistry.put("student" , student);

        IntellijentStudent intellijentStudent = new IntellijentStudent();
        intellijentStudent.setIq(160);
        studentRegistry.put("intellijentStudent" , intellijentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student student1 = studentRegistry.get("student").copy();
        student1.setName("Rana");

        Student student2 = studentRegistry.get("student").copy();
        student2.setName("Deepak");

        Student student3 = studentRegistry.get("intellijentStudent").copy();
        student3.setName("Rana Reddy");

        System.out.println("DEBUG: ");
    }
}
