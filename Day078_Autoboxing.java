/**
 * ============================================
 * 120 Days of Java Learning - Day 78
 * Topic: Autoboxing
 * ============================================
 * Autoboxing: primitive automatically wrapper class me convert ho jata hai.
 * Unboxing: wrapper class automatically primitive me convert ho jata hai (Java 5+ feature).
 */
public class Day078_Autoboxing {

    public static void main(String[] args) {

        java.util.List<Integer> list = new java.util.ArrayList<>();
        list.add(10); // autoboxing: int -> Integer
        int val = list.get(0); // unboxing: Integer -> int
        System.out.println("Autoboxed and unboxed value: " + val);
    }

}
