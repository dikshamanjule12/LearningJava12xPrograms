package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {

    public static void main(String[] args) {
        // String - 90%
        String s0 = "Diksha";
        String s1 = new String("Diksha");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Diksha");
        StringBuilder stringBuilder = new StringBuilder("Diksha");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
    }
