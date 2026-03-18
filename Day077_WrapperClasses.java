/**
 * ============================================
 * 120 Days of Java Learning - Day 77
 * Topic: WrapperClasses
 * ============================================
 * Wrapper classes primitive types ko object me convert karte hain (Integer, Double, Character etc.).
 * Collections generics me sirf objects use ho sakte hain, isliye wrapper classes zaroori hain.
 */
public class Day077_WrapperClasses {

    public static void main(String[] args) {

        int primitive = 10;
        Integer wrapped = Integer.valueOf(primitive); // boxing
        int unwrapped = wrapped.intValue(); // unboxing
        System.out.println("Wrapped: " + wrapped + " Unwrapped: " + unwrapped);
        System.out.println("Parsed from String: " + Integer.parseInt("42"));
    }

}
