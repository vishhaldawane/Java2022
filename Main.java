package com.company;

public class Main {

    public static void main(String[] args) {

	    byte rollNumber = 45;  //camelCase youAreVeryBeautifulPerson
        System.out.println("Min value for a byte is "+Byte.MIN_VALUE);
        System.out.println("Max value for a byte is "+Byte.MAX_VALUE);


        System.out.println("My roll number is : "+rollNumber); //here this + would convert the rollNumber into a String
                                                        //String.valueOf -> String.concat
        System.out.println(100+45); //but here the + would do the original arithmetic addition

        System.out.println("-------------------------");

        short universityRollNumber = 14359;
        System.out.println("My University Roll Number is "+universityRollNumber);
        System.out.println("Min value for a short is : "+Short.MIN_VALUE);
        System.out.println("Max value for a short is : "+Short.MAX_VALUE);

        System.out.println("-------------------------");
        int myInsurancePolicyNumber=2147483647;
        System.out.println("My Insurance policy number is : "+myInsurancePolicyNumber);

        System.out.println("Integer min value : "+Integer.MIN_VALUE);
        System.out.println("Integer max value : "+Integer.MAX_VALUE);
        System.out.println("-------------------------");
        long planetoryDistance=56; // in light years - 92233 72036 85477 5807
        System.out.println("Planetory distance  is : "+planetoryDistance);

        System.out.println("Long min value : "+Long.MIN_VALUE);
        System.out.println("Long max value : "+Long.MAX_VALUE);
        System.out.println("------------");

        float mathsScore = 98.7f;
        System.out.println("my maths score is : "+mathsScore);
        System.out.println("FLoat min value : "+Float.MIN_VALUE);
        System.out.println("Float max value : "+Float.MAX_VALUE);
        System.out.println("------------");

        System.out.println("------------");

        double bankInterestRate = 8.7;
        System.out.println("my banks interest rate is  : "+bankInterestRate);
        System.out.println("Double min value : "+Double.MIN_VALUE);
        System.out.println("Double max value : "+Double.MAX_VALUE);
        System.out.println("------------");

        char gender1='M'; //2 bytes means 16 bits = 65535 different such letters
        char gender2='F';   // international character set - UNICODE
        System.out.println("gender1 is "+gender1);
        System.out.println("gender2 is "+gender2);

        char alphabet = 40; //implicit cast of byte to a char   == 65 is the letter A
        System.out.println("alphabet : "+alphabet);

        byte b = '@'; //implicit cast of char to a byte
        System.out.println("b is "+b);

        boolean married=false;
        boolean areYouHappy=true;
        System.out.println("are you married : "+married);
        System.out.println("are you happy : "+areYouHappy);

        int x; //java would not carry any default value for local variables
       // System.out.println("what is the value of x : "+x);
        String myName = "Vishhal";
        String myCity ="New York";
        System.out.println("my name is "+myName);
        System.out.println("my city is "+myCity);
    }
}
/*

Naming Convention
--------------------
    for classname --> ClassName ------> Joker, SavingsAccount, FixedDepositAccount
    for variables --> variableNames --> rollNumber, socialSecurityNumber
    for function  --> functionName  --> withdrawAmount(), setLookAndFeel(), transferAmount()
    for constants --> CONSTANT      --> SPEED_OF_LIGHT, MAX, MIN, PI



            Data has various types in general
            |
            numeric    -> roll number, employee number
            character  -> gender M / F   Y /  N
            string     -> Ajit Vishhal Abinash Rabina
            floating   -> math score 95.3, cricket avg 87.90
                            temperature, bank interest rate

            boolean    -> true / false

                    Java Data Types
                        |
        ----------------------------------
         |                          | class/object way
         Primitive              Secondary [ non-primitive ]
         |                                           |
 -----------------------------------                ----------
 |          |          |           |                |
 Integral   Floating   Character  Boolean           Strings
 |                |          |         |
 byte   1 (8)     float  4   char 2  boolean 1
 short  2 (16)    double 8              true/false
 int    4 (32)
 long   8 (64)

    how to hold a numeric value in the Java memory

    a byte is made up of 8 bits

    1 bit  = 0
             1

    2 bits = 0 0    0
             0 1    1
             1 0    2
             1 1    3

    3 bits = 0 0 0  0
             0 0 1  1
             0 1 0  2
             0 1 1  3
             1 0 0  4
             1 0 1  5
             1 1 0  6
             1 1 1  7

    4 bits =    16 combinations
    5 bits =    32
    6 bits =    64
    7 bits =    128
    8 bits =    256 <-- consider negative and positive too


    then the dial of 8 bits would be as below

    <------------------------|----------------->
     -128.... -4 -3 -2 -1    0 1 2 3 4   ....127
     <--------------------256 numbers --------->

    byte rollNumber = 127; // the max value
    byte scoreCard = -128; // the min value

    --------------
    9 bits  =   512
    10 bits =   1024
    11 bits =   2048
    12 bits =   4096
    13 bits =   8192
    14 bits =  16384
    15 bits =  32768
    16 bits =  65536 <-- consider negative and positive too


    then the dial of 16 bits would be as below

    <------------------------|--------------------->
     -32768.... -4 -3 -2 -1  0 1 2 3 4   ....32767
     <--------------------65536 numbers --------->

    int universityRollNumber = 16540; // the max value



---------------------------------
int
    17 bits = ..
    18 bits = ..
    32 bits = .. 4 bytes

    -2,147,483,648   0      2,147,483,647
----------------
long

    33 bits
    34 bits
    64 bits = 8 bytes










 */