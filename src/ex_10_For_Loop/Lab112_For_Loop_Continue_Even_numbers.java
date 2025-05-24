package ex_10_For_Loop;

public class Lab112_For_Loop_Continue_Even_numbers {
    public static void main(String[] args) {


        //find the even number from 0 to 50 with continue

        for (int i = 0; i <50 ; i++) {

            if(i%2==0)
            {
//                System.out.println(i);
                continue;
            }

            System.out.println("Odd ->" +i);

        }
    }
}
