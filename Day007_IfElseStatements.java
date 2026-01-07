/**
 * ============================================
 * 120 Days of Java Learning - Day 7
 * Topic: IfElseStatements
 * ============================================
 * if-else conditional statements hain jo condition ke true/false hone par code execute karte hain.
 * Syntax: if(condition){...} else if(condition){...} else {...}
 */
public class Day007_IfElseStatements {

    public static void main(String[] args) {

        int marks = 78;
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 50) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: Fail");
        }
    }

}
