/**
 * ============================================
 * 120 Days of Java Learning - Day 10
 * Topic: StringBasics
 * ============================================
 * String Java me ek object hai (char array nahi), java.lang package me hoti hai.
 * Strings immutable hote hain - ek baar bana lo to change nahi hote, naya string banta hai.
 * String literal pool memory optimize karta hai.
 */
public class Day010_StringBasics {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Learning";
        String combined = s1 + " " + s2;
        System.out.println("Combined: " + combined);
        System.out.println("Length: " + combined.length());
        System.out.println("Uppercase: " + combined.toUpperCase());
    }

}
