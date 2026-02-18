/**
 * ============================================
 * 120 Days of Java Learning - Day 49
 * Topic: NestedTryBlocks
 * ============================================
 * Ek try-catch block ke andar dusra try-catch block ho sakta hai.
 * Inner exception agar handle na ho to outer catch block use handle karta hai.
 */
public class Day049_NestedTryBlocks {

    public static void main(String[] args) {

        try {
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]);
            } catch (NullPointerException e) {
                System.out.println("Inner catch - won't trigger here");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch handled: " + e.getMessage());
        }
    }

}
