package com.company;

public class Person
{
    private char gender;
    private int age;
    private String name;

    Person() { // a constructor function has the same name as of the enclosing class
        System.out.println("Person() ctor...");
        gender='F';
        age=22;
        name="somename";
    }
    Person(char gender, int age, String name) { // a constructor function has the same name as of the enclosing class
        System.out.println("Person(char,int,String) ctor...");
        this.gender=gender;
        this.age=age;
        this.name=name;
    }
    Person(char gender) { // a constructor function has the same name as of the enclosing class
        System.out.println("Person(char) ctor...");
        this.gender=gender;
    }
    Person(char gender, int age) { // a constructor function has the same name as of the enclosing class
        System.out.println("Person(char,int) ctor...");
        this.gender=gender;
        this.age=age;

    }
    Person( int age) { // a constructor function has the same name as of the enclosing class
        System.out.println("Person(int) ctor...");
        this.age=age;
    }
    Person(char gender,  String name) { // a constructor function has the same name as of the enclosing class
        System.out.println("Person(char,String) ctor...");
        this.gender=gender;
        this.name=name;
    }
    Person(int age, String name) { // a constructor function has the same name as of the enclosing class
        System.out.println("Person(int,String) ctor...");
        this.age=age;
        this.name=name;
    }

    public void setPerson(char gender, int age, String name) {
        if(gender=='M' || gender=='F')
            this.gender = gender;
        else {
            RuntimeException rte = new RuntimeException("Invalid gender");
            throw rte;
        }

        if(age >= 1 && age <= 120) {
            this.age = age;
        }
        else {
            RuntimeException rte = new RuntimeException("Invalid age");
            throw rte;
        }

        if(name.matches("^[a-zA-Z]*$")) {
            this.name = name;
        }
        else {
            RuntimeException rte = new RuntimeException("Invalid name");
            throw rte;
        }

    }


    void showPerson() {
        System.out.println("GENDER : "+gender);
        System.out.println("AGE    : "+age);
        System.out.println("NAME   : "+name);
    }
}