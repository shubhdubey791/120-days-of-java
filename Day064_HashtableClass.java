/**
 * ============================================
 * 120 Days of Java Learning - Day 64
 * Topic: HashtableClass
 * ============================================
 * Hashtable HashMap jaisa hi hai lekin synchronized (thread-safe) hai.
 * null key/value allow nahi karta, legacy class hai.
 */
public class Day064_HashtableClass {

    public static void main(String[] args) {

        java.util.Hashtable<String, Integer> ht = new java.util.Hashtable<>();
        ht.put("A", 1);
        ht.put("B", 2);
        System.out.println("Hashtable: " + ht);
        System.out.println("Hashtable does not allow null keys/values");
    }

}
