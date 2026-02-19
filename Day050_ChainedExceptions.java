/**
 * ============================================
 * 120 Days of Java Learning - Day 50
 * Topic: ChainedExceptions
 * ============================================
 * Ek exception dusri exception ka cause ban sakti hai - isse chaining kehte hain.
 * getCause() method se original exception pata chal sakti hai.
 */
public class Day050_ChainedExceptions {

    public static void main(String[] args) {

        try {
            try {
                int x = 10 / 0;
            } catch (ArithmeticException e) {
                throw new RuntimeException("Wrapped exception", e);
            }
        } catch (RuntimeException e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }

}
