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
/*

         -------
       2 |179|
        --------
          89| 1
          -------
          44|1
          ------
          22|0
          ------
          11|0
          ------
          5|1
          -----
          4|1
          ----
          2|0
          -----
          1

          1     0    1      1       0       0       1       1
        2^6    2^6   2^5   2^4      2^3    2^2     2^1     2^0
        128     64   32      16      8      4       2        1
        |            |       |                      |        |




 0          000
 1          001
 2          010
 3          011
 4          100
 5          101
 6          110
 7          111

 8
 9
 10




 */


       //int num1 = 179; // 1     0    1      1       0       0       1       1
       //int num2 = 7; //   0     0    0      0       0       1       1       1
        //--------------------
        //                0     0    0      0       0       0       1       1

       // int num3 = num1 & num2;  // single & is the bitwise opeartor

        //&& is the logical AND operator
       // int age=20;
        //true = 1   false = 0

        //if( age >=1 & age<=120) //  1 & 1

        //married, certified, employed
        //  1       1           1       = 7
        //  1       1           0       = 6
        //  1       0           1       = 5
        //  1       0           0       = 4
        //  0       1           1       = 3
        //  0       1           0       = 2
        //  0       0           1       = 1


        int num=179;
        int status = 7; // 111

        System.out.println("num    : "+Integer.toBinaryString(num));
        System.out.println("status : "+Integer.toBinaryString(status));



        Person person1 = new Person(12);
        person1.showPerson();



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