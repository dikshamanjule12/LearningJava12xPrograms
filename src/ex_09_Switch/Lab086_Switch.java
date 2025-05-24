package ex_09_Switch;

import java.util.Scanner;

public class Lab086_Switch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");

        int day= sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                break;


        }
        //If we enter any number other than 1,2 we will get blank output
    }
}
