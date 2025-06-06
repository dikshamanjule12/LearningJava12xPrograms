package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Diksha");
        stringBuffer.append("Manjule");
        System.out.println(stringBuffer);

        String s1 = "DIksha";
        s1 = s1+ "Manjule";
        System.out.println(s1);


    }
}
