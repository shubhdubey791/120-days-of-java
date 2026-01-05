/**
 * ============================================
 * 120 Days of Java Learning - Day 5
 * Topic: InputUsingScanner
 * ============================================
 * Scanner class java.util package me hoti hai, user se input lene ke liye.
 * nextInt(), nextDouble(), nextLine(), next() common methods hain.
 * Scanner object banane ke liye System.in use karte hain.
 */
public class Day005_InputUsingScanner {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        // Demo ke liye hardcoded value use kar rahe hain (input simulate)
        int demoAge = 21;
        System.out.println("Simulated input -> Age entered: " + demoAge);
        System.out.println("Scanner class se hum real user input le sakte hain: sc.nextInt(), sc.nextLine() etc.");
        sc.close();
    }

}
