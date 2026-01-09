/**
 * ============================================
 * 120 Days of Java Learning - Day 9
 * Topic: TernaryOperator
 * ============================================
 * Ternary operator ek line me if-else likhne ka short tarika hai.
 * Syntax: condition ? valueIfTrue : valueIfFalse
 */
public class Day009_TernaryOperator {

    public static void main(String[] args) {

        int num = 15;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);

        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Max of a,b = " + max);
    }

}
