/**
 * ============================================
 * 120 Days of Java Learning - Day 18
 * Topic: ArrayMethods
 * ============================================
 * java.util.Arrays class me array ke liye ready-made utility methods hote hain.
 * sort(), binarySearch(), fill(), toString() common methods hain.
 */
public class Day018_ArrayMethods {

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 9};
        java.util.Arrays.sort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
        int index = java.util.Arrays.binarySearch(arr, 8);
        System.out.println("Index of 8 after sort: " + index);
    }

}
