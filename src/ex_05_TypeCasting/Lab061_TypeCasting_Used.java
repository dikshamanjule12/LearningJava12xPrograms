package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {

        int course =100;
        float GST = 18.45f;
      //  int total = course+GST; //Narrow - Implicit

        int total = course+ (int)GST; //Narrowing - Explicit

        System.out.println(total); // give integer value - 118

        float total2 = course + GST; //Widening - auto -Implicit
      //  float total3= (float)course + GST; //Widening - Explicit
        System.out.println(total2); //118.45









    }
}
