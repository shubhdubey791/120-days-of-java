/**
 * ============================================
 * 120 Days of Java Learning - Day 43
 * Topic: FinallyBlock
 * ============================================
 * finally block hamesha execute hota hai, chahe exception aaye ya na aaye.
 * Resource cleanup (file close, connection close) ke liye use hota hai.
 */
public class Day043_FinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println("Try block executing");
            int x = 10 / 2;
            System.out.println("Result: " + x);
        } finally {
            System.out.println("Finally block always runs - cleanup here");
        }
    }

}
