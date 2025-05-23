package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {

        int val =300;
      //  byte b = val; //Narrowing - Implicit JVM to do it. - Data loss will be there.
        byte b1 = (byte)val; //Narrowing - Explicit JVM to do it. Data loss will be there.
        System.out.println(b1);   // 44 ans

        // int a = 300;-> int means it will store 32 bits of memory
        //000000000000000000000000101100
      //  byte b1= (byte)a; -> byte means 8 bits memory () -> required like 00101100
        // Value is  0 + 0+32+0+8+4+0+0 =44





    }
}
