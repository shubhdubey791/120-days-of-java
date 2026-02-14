/**
 * ============================================
 * 120 Days of Java Learning - Day 45
 * Topic: CustomExceptions
 * ============================================
 * Apni khud ki exception class banane ke liye Exception class ko extend karte hain.
 * Business-specific errors ke liye custom exceptions useful hote hain.
 */
public class Day045_CustomExceptions {

    public static void main(String[] args) {

        class InsufficientBalanceException extends Exception {
            InsufficientBalanceException(String msg) { super(msg); }
        }
        try {
            double balance = 500;
            double withdraw = 1000;
            if (withdraw > balance) throw new InsufficientBalanceException("Not enough balance!");
        } catch (InsufficientBalanceException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }

}
