/**
 * ============================================
 * 120 Days of Java Learning - Day 58
 * Topic: LinkedHashSetBasics
 * ============================================
 * LinkedHashSet, HashSet jaisa hi hai lekin insertion order maintain karta hai.
 * Internally hash table + linked list use karta hai.
 */
public class Day058_LinkedHashSetBasics {

    public static void main(String[] args) {

        java.util.Set<String> lhs = new java.util.LinkedHashSet<>();
        lhs.add("C"); lhs.add("A"); lhs.add("B");
        System.out.println("LinkedHashSet (insertion order): " + lhs);
    }

}
