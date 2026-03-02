/**
 * ============================================
 * 120 Days of Java Learning - Day 61
 * Topic: HashMapBasics
 * ============================================
 * HashMap key-value pairs store karta hai, keys unique hoti hain.
 * Insertion order guarantee nahi hoti, null key/value allow hota hai.
 */
public class Day061_HashMapBasics {

    public static void main(String[] args) {

        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Mango", 80);
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }

}
