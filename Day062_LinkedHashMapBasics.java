/**
 * ============================================
 * 120 Days of Java Learning - Day 62
 * Topic: LinkedHashMapBasics
 * ============================================
 * LinkedHashMap, HashMap jaisa hi hai lekin insertion order maintain karta hai.
 * Predictable iteration order chahiye ho to ye useful hai.
 */
public class Day062_LinkedHashMapBasics {

    public static void main(String[] args) {

        java.util.Map<String, Integer> lhm = new java.util.LinkedHashMap<>();
        lhm.put("C", 3); lhm.put("A", 1); lhm.put("B", 2);
        System.out.println("LinkedHashMap (insertion order): " + lhm);
    }

}
