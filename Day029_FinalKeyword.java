/**
 * ============================================
 * 120 Days of Java Learning - Day 29
 * Topic: FinalKeyword
 * ============================================
 * final variable: value ek baar set hone ke baad change nahi ho sakti (constant).
 * final method: override nahi ho sakta | final class: extend nahi ho sakti.
 */
public class Day029_FinalKeyword {

    public static void main(String[] args) {

        final int MAX_SPEED = 120;
        System.out.println("Max speed constant: " + MAX_SPEED);
        // MAX_SPEED = 150; // Ye line error dega kyunki final hai
    }

}
