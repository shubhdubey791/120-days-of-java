/**
 * ============================================
 * 120 Days of Java Learning - Day 75
 * Topic: PatternMatcherClasses
 * ============================================
 * Pattern class regex ko compile karta hai, Matcher us pattern ko input string par apply karta hai.
 * java.util.regex package me ye classes hoti hain.
 */
public class Day075_PatternMatcherClasses {

    public static void main(String[] args) {

        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\d+");
        java.util.regex.Matcher matcher = pattern.matcher("Order 123 has 45 items");
        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group());
        }
    }

}
