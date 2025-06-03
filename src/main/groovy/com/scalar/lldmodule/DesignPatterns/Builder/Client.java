package com.scalar.lldmodule.DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        Builder builder = Student.getBuilder();
//        builder.setName("Rana");
//        builder.setAge(23);
//        builder.setPsp(88);
//        builder.setGradYear(2022);
//
////        Student student = new Student(builder);
//        Student student = builder.build();

        Student student =
                Student.getBuilder()
                                .setName("Rana")
                                .setAge(23)
                                .setPsp(88)
                                .setGradYear(2022)
                                .setBatch("new batch")
                .build();

        System.out.println("DEBUG: ");
    }
}


/*
Steps followed to make the code more intuitive ->
1. Static getBuilder method in Student class.
2. build() method inside Builder class.
3. Making Student Constructor Private.
4. Move Builder class inside the Student class.
5. Make the Builder class static.
6. Change the Builder setters method return type to Builder itself.
*/