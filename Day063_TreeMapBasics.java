/**
 * ============================================
 * 120 Days of Java Learning - Day 63
 * Topic: TreeMapBasics
 * ============================================
 * TreeMap keys ko sorted order me store karta hai (natural ordering).
 * Internally Red-Black tree structure use karta hai.
 */
public class Day063_TreeMapBasics {

    public static void main(String[] args) {

        java.util.Map<String, Integer> tm = new java.util.TreeMap<>();
        tm.put("Zebra", 1); tm.put("Apple", 2); tm.put("Mango", 3);
        System.out.println("TreeMap (sorted keys): " + tm);
    }

}
