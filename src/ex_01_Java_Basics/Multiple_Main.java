package ex_01_Java_Basics;

public class Multiple_Main {

    public static void main(String[] args) {

        System.out.println("There can be multiple main methods but only one main method with JVM recognise");

    }

    public static void main(int args) {   //JVM does not recognise as main function because there's no green color arrow

    }

    public static void main(String args) {   //JVM does not recognise as main function because there's no green color arrow


    }
}

