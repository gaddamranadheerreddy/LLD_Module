package com.scalar.lldmodule.DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Rana");
        builder.setAge(23);
        builder.setPsp(88);
        builder.setGradYear(2022);

        Student student = new Student(builder);
        System.out.println("DEBUG: ");
    }
}
