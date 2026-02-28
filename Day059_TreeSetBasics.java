/**
 * ============================================
 * 120 Days of Java Learning - Day 59
 * Topic: TreeSetBasics
 * ============================================
 * TreeSet elements ko sorted (natural) order me store karta hai.
 * Internally Red-Black tree use hota hai, duplicates allow nahi karta.
 */
public class Day059_TreeSetBasics {

    public static void main(String[] args) {

        java.util.Set<Integer> ts = new java.util.TreeSet<>();
        ts.add(50); ts.add(10); ts.add(30); ts.add(20);
        System.out.println("TreeSet (sorted): " + ts);
    }

}
