/**
 * ============================================
 * 120 Days of Java Learning - Day 72
 * Topic: StringBufferClass
 * ============================================
 * StringBuffer, StringBuilder jaisa hi hai lekin synchronized (thread-safe) hai.
 * Multithreaded environment me StringBuffer use karna better hai.
 */
public class Day072_StringBufferClass {

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf);
        System.out.println("StringBuffer is thread-safe, StringBuilder is not");
    }

}
