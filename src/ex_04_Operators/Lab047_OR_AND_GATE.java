package ex_04_Operators;

public class Lab047_OR_AND_GATE {
    public static void main(String[] args) {
        // || - OR

        System.out.println(true || true );
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // AND && // only true returns true

        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

    }
}
