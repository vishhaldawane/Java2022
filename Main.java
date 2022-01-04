package com.company;

class Person
{
    private char gender;
    private int age;
    private String name;

    void setPerson(char gender, int age, String name) {
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

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setPerson('F',22,"Julie"); //via the function we can control valid values
        person.showPerson();
        //person.gender='X';
        //person.age=200;
        //person.name="@#$@#$";
       // person.showPerson();
    }
}
/*

        OOPS concepts

        POPS = procedure oriented programming concept
        procedure <-- data

        Object Oriented Programming Concept

        Object = data <-- functions

        Account = balance + withdraw() / deposit() / transfer()

        Prepare a Shirt from a raw cloth

        if we are a tailor to prepare it

        What are the steps?

        "data" and its "relevant" function

        1. Take a cloth
        2. take the measurement of the customer's body
        3. write down these measurements() on the "PAPER" - "PEN"

        4. makeACuttingDiagram() on the cloth <-- read the PAPER
           as per the measurements using a special "CHALK"

        5. cut() the diagram into the pieces using a "SCISSOR"

        6. stitch the relevant pieces using a "NEEDLE" - stitching machine
        7. Press it using an "IRON"
        8. pack it in the "BOX"


        Customer - BODY
            |
            measureBody()
            |
            PAPER <= write <= PEN
            |
            read => CHALK => plotCuttingDiagram()
                                |
                                SCISSOR --> PIECES
                                             |
                                             NEEDLE
                                             |
                                             Shirt is READY
                                                        |
                                                        Iron => BOX IT




 */