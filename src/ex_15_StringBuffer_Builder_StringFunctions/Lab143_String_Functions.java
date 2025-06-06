package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {

    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());   //5
        System.out.println(name.charAt(3));  // a
//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException: Index 10 ou

        // 2. concat()
        System.out.println(name.concat(" Patel")); //Sonal Patel

        // 3. contains()
        System.out.println(name.contains("om"));  //false

        // 4. equals()
        System.out.println(name.equals("Sonal"));  //true

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));  // true

        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('o'));  //1

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));   //0

        // 7. length()
        System.out.println(name.length()); //5

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));  //SoNal

        // 10. substring( , )
        System.out.println(name.substring(1, 3));  //on

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase()); //sonal

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase()); //SONAL

        // 14. startsWith()
        System.out.println(name.startsWith("S")); //true

        // 15. endsWith()
        System.out.println(name.endsWith("a"));//false

        // 16. trim()
        String name3 = "    Sonal Harish     ";
        System.out.println(name3.trim());    //Sonal Harsih - removes all the spaces

        // 17. compareTo()
        System.out.println(name.compareTo("Sonal")); // 0


        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);   //Sonal

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString()); //Hi


        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar); //roar


        String s11 = "Diksha";
        String s21 = s11.concat("Manjule");
        System.out.println(s21);//DikshaManjule

    }
}
