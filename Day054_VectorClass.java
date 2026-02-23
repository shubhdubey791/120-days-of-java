/**
 * ============================================
 * 120 Days of Java Learning - Day 54
 * Topic: VectorClass
 * ============================================
 * Vector ArrayList jaisa hi hai lekin synchronized (thread-safe) hota hai.
 * Legacy class hai, modern code me ArrayList ya Collections.synchronizedList() prefer kiya jata hai.
 */
public class Day054_VectorClass {

    public static void main(String[] args) {

        java.util.Vector<String> v = new java.util.Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");
        System.out.println("Vector: " + v);
        System.out.println("Vector is synchronized (thread-safe) by default");
    }

}
