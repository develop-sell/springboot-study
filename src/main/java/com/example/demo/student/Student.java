package com.example.demo.student;

public class Student {

    private final String name;
    private final String email;
    private final int age;

    public Student(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    
    
}
