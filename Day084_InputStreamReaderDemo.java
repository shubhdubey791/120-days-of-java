/**
 * ============================================
 * 120 Days of Java Learning - Day 84
 * Topic: InputStreamReaderDemo
 * ============================================
 * InputStreamReader byte stream ko character stream me convert karta hai (bridge class).
 * Console se input lene ke liye System.in ke saath use hota hai.
 */
public class Day084_InputStreamReaderDemo {

    public static void main(String[] args) {

        java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
        System.out.println("InputStreamReader converts byte stream (System.in) to character stream");
        System.out.println("Commonly wrapped with BufferedReader for reading console input line by line");
    }

}
