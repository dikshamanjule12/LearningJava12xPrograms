package String_Exercises;

public class StringComparison_2 {
    public static void main(String[] args) {
        // Input strings
        String string1 = "hello";
        String string2 = "hello";
        String string3 = "Hello";

        // Using '==' operator (compares references, not content)
        boolean isEqualUsingDoubleEquals = (string1 == string2);

        // Using .equals() method (compares content)
        boolean isEqualUsingEquals = string1.equals(string3);

        // Using .equalsIgnoreCase() method (ignores case)
        boolean isEqualIgnoreCase = string1.equalsIgnoreCase(string3);

        // Using .compareTo() method (lexicographical comparison)
        int compareToResult = string1.compareTo(string3);

        // Output results
        System.out.println("Using '==': " + isEqualUsingDoubleEquals); // true (same reference in this case)
        System.out.println("Using .equals(): " + isEqualUsingEquals); // false (case-sensitive)
        System.out.println("Using .equalsIgnoreCase(): " + isEqualIgnoreCase); // true (ignores case)
        System.out.println("Using .compareTo(): " + compareToResult); // Non-zero (case-sensitive comparison)
    }
}
