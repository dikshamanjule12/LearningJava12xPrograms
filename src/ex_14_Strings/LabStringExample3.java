package ex_14_Strings;

public class LabStringExample3 {

    public static void main(String[] args) {

        String s = "Java".substring(2);  //string after 2 or index 2
        System.out.println(s);

        String s1 = "Java".substring(1, 3);  // string between and 3
        System.out.println(s1);

        char[] arr = "Java".toCharArray();   //
        System.out.println(arr); // ['J', 'a', 'v', 'a']

        String st = " Java ".trim(); // "Java" last character space to remove
        System.out.println(st);

        boolean b = "   ".isBlank();  //boolean value
        System.out.println(b);

        String s2 = "ab".repeat(3);  //ababab
        System.out.println(s2);

        boolean b11 = "Java".equalsIgnoreCase("java");  //true
        System.out.println(b11);

        String s111 = String.format("%s = %d", "age", 25);  // age = 25
        System.out.println(s111);

        long count = "a\nb\nc".lines().count();  //3
        System.out.println(count);
    }
}
