package ex_10_For_Loop;

public class Lab110_For_Loop_Break {

    public static void main(String[] args) {

        for(int i=0; i<50; i++) // 0 to 5, 6 timess
        {
            System.out.println(i);
            if(i==5) {
//                System.out.println(i);
                break;
            }
        }

        for(int i=0; i<50; i++) // 0 to 4, 5 times
        {

            if(i==5) {
                break;
            }

            System.out.println(i);
        }
    }
}
