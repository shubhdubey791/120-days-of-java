/**
 * ============================================
 * 120 Days of Java Learning - Day 56
 * Topic: ListIterator
 * ============================================
 * ListIterator, Iterator ka extended version hai jo bidirectional traversal allow karta hai.
 * hasPrevious(), previous(), set() jaise extra methods available hain.
 */
public class Day056_ListIterator {

    public static void main(String[] args) {

        java.util.List<String> list = new java.util.ArrayList<>(java.util.List.of("A", "B", "C"));
        java.util.ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String val = lit.next();
            lit.set(val + "!"); // modify while iterating
        }
        System.out.println("Modified list: " + list);
    }

}
