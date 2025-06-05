package ex_11_while;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {


    public static void main(String[] args) {

        // Guess a number b/w 1 and 100

        //Step 1  : Input/output
        //Step 2 : Roguh logic
        //Step 3 : Proper logic
        //Step 4 : Optimize
        //Step 5 : Error edge cases

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
//        System.out.println(numberToGuess);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int guess;
        int attempts = 0;

        while (true) {

            if (!sc.hasNextInt())
            {
                System.out.println("Invalid input! Please enter a number");
                sc.next();   //consume invalid token
                continue;
            }

            guess = sc.nextInt();
            attempts++;

            if(guess <= 1 || guess >= 100)
            {
                System.out.println("Please enter a number between 1 and 100");
                continue;
            }

            if (guess < numberToGuess) {

                System.out.println("Too low, try again!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again");

            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
                break;
            }

        }
    }
}
