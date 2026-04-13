/**
 * ============================================
 * 120 Days of Java Learning - Day 103
 * Topic: StreamAPIBasics
 * ============================================
 * Stream API collections par functional-style operations perform karne deta hai (Java 8+).
 * Stream data source ko modify nahi karta, naya result produce karta hai.
 */
public class Day103_StreamAPIBasics {

    public static void main(String[] args) {

        java.util.List<Integer> nums = java.util.List.of(1, 2, 3, 4, 5);
        long count = nums.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Count of even numbers: " + count);
    }

}
