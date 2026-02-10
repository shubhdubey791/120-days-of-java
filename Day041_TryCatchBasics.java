/**
 * ============================================
 * 120 Days of Java Learning - Day 41
 * Topic: TryCatchBasics
 * ============================================
 * Exception ek runtime error hoti hai jo normal program flow ko disrupt karti hai.
 * try block me risky code, catch block me exception handle hoti hai.
 */
public class Day041_TryCatchBasics {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }

}
