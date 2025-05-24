package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation_Usage {
    public static void main(String[] args) {

        //Web Automation
        // User to give inout from browser which he want to
        //use so I will start automation in that browser


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser= sc.next();
        browser=browser.toLowerCase() ;  //used this so that case sensitiveness is handled

    switch(browser)
        {
            case "chrome":
                System.out.println("Starting the chrome browser");
                System.out.println(".........");
                System.out.println("..TC1...");
                System.out.println("..TC2...");
                break;
            case "firefox":
                System.out.println("Starting the firefox brwoser");
                //Further code to start firefox //Selenium code
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("No idea which browser it is..");
                break;


        }

    }
}
