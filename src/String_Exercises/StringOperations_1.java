package String_Exercises;

public class StringOperations_1 {

    public static void main(String[] args) {
        // Input string
        String input = "hello world";

        // 1. Calculate and display the length of the string
        int length = input.length();
        System.out.println("Length: " + length);

        // 2. Extract and display the first character
        char firstChar = input.charAt(0);
        System.out.println("First Character: " + firstChar);

        // 3. Extract and display the substring "world"
        String substring = input.substring(6); // "world" starts at index 6
        System.out.println("Substring: " + substring);

        // 4. Concatenate and display a new string
        String concatenated = input + " - Java Programming";
        System.out.println("Concatenated String: " + concatenated);
    }
}
