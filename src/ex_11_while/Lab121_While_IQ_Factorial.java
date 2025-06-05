package ex_11_while;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {

    public static void main(String[] args) {

        //Factorial program
        //Step 1 ; input /output
        //Step 2 : rough logic
        //Step 3 : proper logic
        //Step 4 : Optimize
        //Step 5 : Edge cases


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Factorial Program");
        System.out.println("Enter the number, whose factorial you want!");

        if (!sc.hasNextInt())
        {
            System.out.println("Enter the int no., rerun the program");
        }

        int number =sc.nextInt();
        int factorial =1;

        if(number<=0)
        {
            System.out.println("Factorial is -> " +factorial);
        }


        if(number ==0 )
        {
            System.out.println("Factorial is -> "+factorial);
        }

        if(number> Integer.MAX_VALUE){
            System.out.println("Can't get the factorial  as out of bound(int)");
        }



        int i=1;
        while(i<=number)
        {
            factorial= factorial*i;
            i++;
        }

        System.out.println("Factorial is -> "+factorial);






    }
}
