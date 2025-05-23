package ex_07_Increment_Decrement_Op;

public class Lab069_In_De_Op {

    public static void main(String[] args) {

        // Take inputs

        String age_string = args[0];
        String a1 = args [1];
        String a2 = args [2];
        String a3 = args [3];


        System.out.println(age_string);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        // to perform mathematical operations we need to give integer values the above are String values
        float f1 = Float.parseFloat(a1);
        System.out.println(f1);

        //If the arguments are less and we calling more in the program then JavaArrayOutofBoundException occurs


    }
}
