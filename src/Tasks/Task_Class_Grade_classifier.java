package Tasks;

import java.util.Scanner;

public class Task_Class_Grade_classifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade (A-F): ");
        String input = scanner.nextLine().trim().toUpperCase();

        char grade = input.charAt(0);
        switch(grade)
        {
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Needs Improvement");
                break;
            case 'E':
                System.out.println("Fail");
            default:
                System.out.println("Invalid grade");
                break;


        }






    }
}
