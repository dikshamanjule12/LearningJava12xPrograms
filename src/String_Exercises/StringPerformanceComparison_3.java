package String_Exercises;

public class StringPerformanceComparison_3 {
    public static void main(String[] args) {
        int iterations = 1000;
        String result;

        // Measure time for String concatenation
        long startTime = System.nanoTime();
        result = "";
        for (int i = 0; i < iterations; i++) {
            result += "test";
        }
        long endTime = System.nanoTime();
        long stringTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("String concatenation time: " + stringTime + "ms");

        // Measure time for StringBuilder
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("test");
        }
        result = stringBuilder.toString();
        endTime = System.nanoTime();
        long stringBuilderTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("StringBuilder time: " + stringBuilderTime + "ms");

        // Measure time for StringBuffer
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("test");
        }
        result = stringBuffer.toString();
        endTime = System.nanoTime();
        long stringBufferTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("StringBuffer time: " + stringBufferTime + "ms");
    }

}
