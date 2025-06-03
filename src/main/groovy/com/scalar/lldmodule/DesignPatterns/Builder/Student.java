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

    //This is static method
    // -> If calling non-static  -> gives error
    // -> So should call only static methods/class
    // -> So make Builder class static.
    public static Builder getBuilder(){
        return new Builder();
    }

    //Student Constructor -> Public -> AnyOnce can create Student Object.
    private Student(Builder builder) {
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

    //Inner Class
    static class Builder {
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String batch;
        private long id;
        private int gradYear;
        private String phoneNumber;

        public Student build() {
            return new Student(this); //Private Student Constructor
            // -> cannot be accessed from Outside of the class.
            //Lets move this class inside the Student class
            // -> So that we can access the private Constructor of Student class.
            //Now the private Student constructor can be accessed
            // -> as we are inside the Student Class now.
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
    }
}
