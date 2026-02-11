/**
 * ============================================
 * 120 Days of Java Learning - Day 42
 * Topic: MultipleCatchBlocks
 * ============================================
 * Ek try block ke multiple catch blocks ho sakte hain, alag exceptions ke liye.
 * Specific exception pehle, general exception baad me likhna best practice hai.
 */
public class Day042_MultipleCatchBlocks {

    public static void main(String[] args) {

        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        }
    }

}
