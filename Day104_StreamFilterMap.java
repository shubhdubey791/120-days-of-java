/**
 * ============================================
 * 120 Days of Java Learning - Day 104
 * Topic: StreamFilterMap
 * ============================================
 * filter() elements ko condition ke basis par select karta hai.
 * map() har element ko transform karke naya stream banata hai.
 */
public class Day104_StreamFilterMap {

    public static void main(String[] args) {

        java.util.List<String> names = java.util.List.of("Shubh", "Amit", "Sara", "Om");
        names.stream()
             .filter(n -> n.length() > 2)
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }

}
