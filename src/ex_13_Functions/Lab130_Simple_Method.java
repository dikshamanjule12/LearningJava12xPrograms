package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {

        non_return_Type_func();    //void does not return anything only printing

        int a= return_Type_func();
        System.out.println(a);   //return a particular data type


    }

    static void non_return_Type_func(){
        System.out.println("Hi, Non Return type");
    }

    static int return_Type_func(){
        System.out.println("Hi,  Return type");
        return 10;
    }

    static boolean return_boolean()
    {
        return true;

    }
    static float return_float_pi_value()
    {
        return 3.14f;

    }

    static byte return_byte()
    {
        return 100;

    }

    static long return_long()
    {
        return 10l;
    }

    static String return_string()
    {
        return "Diksha";

    }
}
