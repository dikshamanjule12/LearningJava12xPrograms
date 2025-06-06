package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello"; //Here s1,s4, s10 value is same hence the location will be same in SCP but diff references
        String s10 = "Hello";
        String s11 = "hello";  //Here s11 value is diff so diff location diff reference
         //In above 2 SCP's are allocated

        String s2 = new String("Hello");   //new memory allocated for s2 in OA due to new operator
        String s3 = new String("Hello");    //new memory allocated for s2 in OA due to new operator even if the value is same
        String s5 = new String("hello");    //new memory allocated for s2 in OA due to new operator

        //In above 3 OA's are allocated for the variable values
    }
}
