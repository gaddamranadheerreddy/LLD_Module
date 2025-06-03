package com.scalar.lldmodule.DesignPatterns.Builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private String phoneNumber;

    public static Builder getBuilder(){
        return new Builder();
    }

    public Student(Builder builder) {
        //Validations -> Start
        if(builder.getGradYear() > 2024){
            throw new RuntimeException("grad Year shouldn't be grater than current year");
        }
        //validations -> End

        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.universityName = builder.getUniversityName();
        this.batch = builder.getBatch();
        this.id = builder.getId();
        this.gradYear = builder.getGradYear();
        this.phoneNumber = builder.getPhoneNumber();

    }
}
