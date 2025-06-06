package Tasks;

import java.util.Scanner;

public class ReverseNumberSimple {
    public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the number you want to reverse");
            if(scanner.hasNextInt()){
                int num= scanner.nextInt();
                int revNum = 0;
                while (num>0){
                    revNum= num%10 + revNum*10;
                    num=num/10;

                }
                System.out.println(revNum);
            }
            else System.out.println("Please enter an integer only");
        }

    }