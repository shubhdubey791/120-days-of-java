/**
 * ============================================
 * 120 Days of Java Learning - Day 52
 * Topic: ArrayListBasics
 * ============================================
 * ArrayList ek resizable array hai, List interface implement karta hai.
 * Duplicate elements allow karta hai, insertion order maintain karta hai.
 */
public class Day052_ArrayListBasics {

    public static void main(String[] args) {

        java.util.List<String> fruits = new java.util.ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("Fruits list: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));
    }

}
