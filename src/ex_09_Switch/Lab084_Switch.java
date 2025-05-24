package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {


        //Problem Statement - You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7
        // you will tell which day it is.

       //** Logic building formula

        // Step 1- use Scanner class
        // Step 2 - Figuring out the expression and the day
        //Step 3 - rough logic
        //Step 4 - write/fix the logic and optimize
        //Step 5 - firgure out the edge cases

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");

        if(sc.hasNextInt())     //to enter only int values
        {
            int day= sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Enter int number from 1 to 7");
        }
        System.out.println("End of the program");
        }
        else{
            System.out.println("Please enter int value");
        }

    }
}
