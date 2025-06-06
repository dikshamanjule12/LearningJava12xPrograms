package Tasks;

public class ReverseString {

    public static void main(String[] args) {
        String originalString = "hello"; // The string we want to reverse
        String reversedString = "";    // This will store our reversed string

        // Loop from the last character of the original string to the first
        for (int i = originalString.length() - 1; i >= 0; i--) {
            // Get the character at the current position 'i'
            char charToAdd = originalString.charAt(i);

            // Add this character to our reversedString
            reversedString = reversedString + charToAdd; // Or reversedString += charToAdd;
        }

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString); // This will print "olleh"
    }


}
