package ex_13_Functions;

import java.util.Scanner;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {

        //User Defined Functions.

        //1.Without Parameters and without return type
        //2.Without Parameters but with return type
        //3.With Parameters and without Return Type
        //4.With Parameters nd with return type

        //1.without argument /Parameters and without return type
        wp_wr_greet();

        //2.Without Parameters but with Return Type
        String msg =greet_with_hello_wp_with_RT();
        System.out.println(msg);

        //3.With Parameters and without Return Type
        greet_with_details("Diksha", 30, 12000);
        greet_with_details("Ankit", 32, 10000);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println("Enter Salary");
        double salary = sc.nextDouble();

        greet_with_details(name,age,salary);


        //4.With Parameters nd with return type
        int sum= sum_of_two_numbers(3,4);
        int sum1 = sum_of_three_numbers(10,11,10);
        float sum2 =sum_of_three_numbers(10.12f,11.0f,12.3f);

        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);

    }

    //1.Without Parameters and without return type (declare/Define)
    static void wp_wr_greet(){
        System.out.println("Hi, How are you?");
    }

    //2.Without Parameters but with return type
    static String greet_with_hello_wp_with_RT(){
        System.out.println("Hi");
        return "How are you?";
    }


    //3.With Parameters and without Return Type
    static void greet_with_details(String name, int age, double salary)
    {
        System.out.println("Your name is ->" +name+ "\n Your age is "+age +"\n Your salary is "+salary);
    }

    //4.With Parameters nd with return type


    static int sum_of_two_numbers(int a, int b)
    {
        return a+b;
    }

    static int sum_of_three_numbers(int a, int b, int c)
    {
        return a+b+c;
    }

    static float sum_of_three_numbers(float a, float b, float c)
    {
        return a+b+c;
    }
}
