/**
 * ============================================
 * 120 Days of Java Learning - Day 3
 * Topic: Operators
 * ============================================
 * Java me operators kai type ke hote hain: Arithmetic, Relational, Logical, Assignment, Unary.
 * Arithmetic: + - * / %
 * Relational: == != > < >= <=  |  Logical: && || !
 */
public class Day003_Operators {

    public static void main(String[] args) {

        int a = 15, b = 4;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a > b: " + (a > b));
        System.out.println("(a>b) && (b>0): " + ((a > b) && (b > 0)));
    }

}
