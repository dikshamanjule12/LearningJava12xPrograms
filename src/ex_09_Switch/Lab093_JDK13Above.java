package ex_09_Switch;

public class Lab093_JDK13Above {
    public static void main(String[] args) {

        //code is working after JDK 13 , break is not used when we use case in the below way
        int itemCode =001;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");

            //used when one liner switch stmts to be used

        }
    }
}
