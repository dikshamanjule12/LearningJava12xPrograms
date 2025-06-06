package Tasks;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        String word= sc.next();

        int[] result = countVowelsCons(word);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }

    static int[] countVowelsCons(String str) {
        int vCount = 0;
        int cCount = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if((ch >= 'a' && ch <= 'z') )
            {
                cCount++;
            }
        }

        return new int[]{vCount, cCount};
    }
}


