package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {

        // Nested Ternary

        // result = condition1 ? expression 1 : (condition 2 ? expression2: expression3)

        int number =27;
        String result = (number >18) ? (number >25 ?  "In Goa, You can drink": "You can't drink") : " You can't go to Goa";
        System.out.println(result);
    }
}
