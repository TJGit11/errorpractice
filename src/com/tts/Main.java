package com.tts;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
////        System.out.println("Hello Java");
////        System.out.println("Hi");
////        System.out.println("hey");
//        Scanner input = new Scanner(System.in);
////        Getting user input for first name
//        System.out.println("What is your name?");
//        String firstName = input.nextLine();
////     vv this is where we see the user input vv
////        System.out.printf("Hello %s!\n", firstName);
////        Getting lastname from the user
//        System.out.println("What is your last name?");
//        String lastName = input.nextLine();
//        System.out.printf("Your name is %s %s.\n", firstName, lastName);
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter Your First Name, Last Name, Age, and City");
//        String firstName = myObj.nextLine();
//        String lastName = myObj.nextLine();
////        Scanner myInt = new Scanner(System.in)
//        int age = myObj.nextInt();
//        myObj.nextLine();
//        String location = myObj.nextLine();
//        System.out.println("First Name:" + firstName);
//        System.out.println("Last Name:" + lastName);
//        System.out.println("Age:" + age);
//        System.out.println("Location:" + location);

        Scanner input = new Scanner(System.in);
        // java cant find "line" command
        System.out.printline("Enter a name: ");
        String name = input.nextLine();
        System.out.println("Give me an adverb: ");
        String adverb = input.nextLine();
        System.out.println("Give me a adjective: ");
        String adjective = input.nextLine();
        // syntax, end line with ";"
        System.out.println("Give me a verb: ");
        // not assigning variable but saying it is equivalent
        String verb == input.nextLine();
        // doesnt recognize systemout
        Systemout.println("Give me a noun two: ");
        String nounTwo = input.nextLine();
        System.out.println("Give me a number: ");
        String number = input.nextLine();
        System.out.println("Give me your name: ");
        // yourrName mispelled, doesn't match and therefore cannot be called again later
        String yourrName = input.nextLine();
        System.out.printf("Here is your story: \n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, verb);
        System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
        // your name doesn't work because it doesn't match "yourrName"
        System.out.printf("\n Sincerely, %s \n", yourName);

        //casting is converting, slides 32-33
//        byte b = (byte)34;
//        System.out.println(b);
//
//        int numberAbove = (int)number


        // might be nice for the lab later
//        int a = 4;
//        String b = "5";
//        int c = a + b; // gives an error, because cant add Strings as numbers
//        int d = a + (int)b; // works because now b is cast as an int

    }
}
