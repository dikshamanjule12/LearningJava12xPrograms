package ex_14_Strings;

public class Lab141_String_Interview_P2 {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello"; //1 value stored in SCP

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");   //3 diff values stored for 3 diff variables in OA


        // == -> Comparison -> String => this check the ref location
        System.out.println(s1 == s3);   //false
        System.out.println(s1 == s2);  //false
        System.out.println(s2 == s3); //false

        System.out.println(s1 == s4);  //true
        System.out.println(s3 == s5);   //false


        // equals ( content) -> value -- compares the value in this case
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equals(s3));  //true
        System.out.println(s3.equals(s5));  //false due to case sensitiveness
        System.out.println(s3.equalsIgnoreCase(s5)); //true as we ignored the cases sensitiveness

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value


    }
}
