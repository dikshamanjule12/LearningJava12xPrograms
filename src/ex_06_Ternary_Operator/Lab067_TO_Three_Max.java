package ex_06_Ternary_Operator;

public class Lab067_TO_Three_Max {
    public static void main(String[] args) {

        int n1=29;
        int n2=9;
        int n3=11;


        //Logic building formula

        //Step 1 -> Find the inputs and outputs data type
        // I/O -> n1, n2,n3 -> int
        // O/P --> int - max number or we can message with max number

        //Step 2 - Rough Logic, think about it.
        //n1>n2 && n1>n3 --> n1
        // n2>n3 && n2>n1 -> n2
        //n3 if both false

        //Step 3 - Dry run program
       int max = (n1>n2) ?(n1>n3) ? n1:n3: ((n2>n3) ? n2:n3);
       System.out.println(max);



    }
}
