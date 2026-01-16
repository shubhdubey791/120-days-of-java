/**
 * ============================================
 * 120 Days of Java Learning - Day 16
 * Topic: Arrays1D
 * ============================================
 * Array ek fixed-size collection hai jo same data type ke elements store karta hai.
 * Declaration: dataType[] arrayName = new dataType[size];
 * Index hamesha 0 se shuru hota hai.
 */
public class Day016_Arrays1D {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }

}
