/**
 * ============================================
 * 120 Days of Java Learning - Day 57
 * Topic: HashSetBasics
 * ============================================
 * HashSet unique elements store karta hai, duplicates allow nahi karta.
 * Insertion order guarantee nahi hota, internally HashMap use hota hai.
 */
public class Day057_HashSetBasics {

    public static void main(String[] args) {

        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // duplicate - ignore ho jayega
        System.out.println("HashSet (no duplicates): " + set);
        System.out.println("Size: " + set.size());
    }

}
