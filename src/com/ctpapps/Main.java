package com.ctpapps;

/*
This Game Will Simulate Thrown Dice
Input User Data
Returning Total The Throw
Alert If Snake Eyes Have Been Achieved
Created By Charlie Woods
February 03, 2017
 */

public static void Main(String[]args){

        import java.util.Scanner;
        Scanner charscan = new Scanner(System.in); // Awaiting User Input
        }

        do{

        System.out.println("Hi!, How Many Sides Would You Like Your Dice To Have?");    // Short Greeting & Question
        numSides=(int)charscan.nextInt();       // User Input For Number Of Sides

        int dice1;    // Returns Roll For Die#1
        int dice2;    // Returns Roll For Die#2
        int numSides; // Returns User Input For Number Of Sides
        int rollTot;  // Returns Sum Of Both Die#1 & Die#2

        dice1=(int)(Math.random()*6)+1;     // Returns Random Number Between 1 & 6
        Sys.out.println("You Rolled A:" + dice1);

        dice2=(int)(Math.random()*6)+1;     // Returns Random Number Between 1 & 6
        Sys.out.println("You Rolled A:" + dice2);

        rollTot=dice1+dice2;                   // Returns Total For Dice1 & Dice2
        Sys.out.println("Total Roll Is:" + rollTot);

        if(rollTot==2);
        System.out.println("Congrats!!! Snake Eyes! "); // User Informed Of Snake Eyes

        if (rollTot == 7 || rollTot == 11);
        System.out.println("Congrats!!! ")  //User Informed of Craps

        System.out.println("Still Feeling Lucky?" + Y/N);   // Player Asked To Play Again
        char a=charscan.next();
        }

        {while(a=='Y'||a=='y') // Yes/No Validation
        System.out.println("See Ya Next Time!")  // Exit Message

        System.exit(0);
        }
