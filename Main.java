package com.company;
/*
        A constructor is a special function that has the same name as of the enclosing class
         a constructor is called during object creation process
         IT DOES NOT HAVE RETURN TYPE
         BUT IT CAN TAKE PARAMETERS

         it is used to initialize the object data



 */

class Bird { }
public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Person person1 = new Person('F',22,"Radha");
        Person person2 = new Person('M',23,"Shyam");
        Person person3 = new Person('F',20,"Meera");

        person1.showPerson();
        person2.showPerson();
        person3.showPerson();

        // person.setPerson('F',22,"Julie"); //via the function we can control valid values
        //person.showPerson();
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