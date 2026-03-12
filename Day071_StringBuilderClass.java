/**
 * ============================================
 * 120 Days of Java Learning - Day 71
 * Topic: StringBuilderClass
 * ============================================
 * StringBuilder mutable string hai - append/modify karne par naya object nahi banta.
 * Loop me string concatenation ke liye StringBuilder efficient hota hai (non-synchronized).
 */
public class Day071_StringBuilderClass {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is");
        sb.append(" awesome");
        sb.insert(0, "[Note] ");
        System.out.println(sb.toString());
        System.out.println("Reversed: " + sb.reverse());
    }

}
