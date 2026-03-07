/**
 * ============================================
 * 120 Days of Java Learning - Day 66
 * Topic: CollectionsUtilityClass
 * ============================================
 * Collections class me static utility methods hain jaise sort(), reverse(), max(), min().
 * Ye methods List, Set, Map ke saath kaam karne me help karte hain.
 */
public class Day066_CollectionsUtilityClass {

    public static void main(String[] args) {

        java.util.List<Integer> nums = new java.util.ArrayList<>(java.util.List.of(5, 2, 8, 1, 9));
        java.util.Collections.sort(nums);
        System.out.println("Sorted: " + nums);
        java.util.Collections.reverse(nums);
        System.out.println("Reversed: " + nums);
        System.out.println("Max: " + java.util.Collections.max(nums));
        System.out.println("Min: " + java.util.Collections.min(nums));
    }

}
