/**
 * ============================================
 * 120 Days of Java Learning - Day 105
 * Topic: StreamCollect
 * ============================================
 * collect() stream ko wapas collection (List, Set, Map) me convert karta hai.
 * Collectors class me toList(), toSet(), joining() jaise ready methods hain.
 */
public class Day105_StreamCollect {

    public static void main(String[] args) {

        java.util.List<Integer> nums = java.util.List.of(1, 2, 3, 4, 5);
        java.util.List<Integer> squares = nums.stream()
                .map(n -> n * n)
                .collect(java.util.stream.Collectors.toList());
        System.out.println("Squares: " + squares);

        String joined = java.util.List.of("Java", "is", "fun").stream()
                .collect(java.util.stream.Collectors.joining(" "));
        System.out.println("Joined: " + joined);
    }

}
