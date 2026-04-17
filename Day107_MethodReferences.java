/**
 * ============================================
 * 120 Days of Java Learning - Day 107
 * Topic: MethodReferences
 * ============================================
 * Method reference lambda ka shorthand hai jab lambda sirf existing method call karta hai.
 * Syntax: ClassName::methodName ya object::methodName
 */
public class Day107_MethodReferences {

    public static void main(String[] args) {

        java.util.List<String> names = new java.util.ArrayList<>(java.util.List.of("charlie", "alpha", "bravo"));
        names.sort(String::compareTo); // method reference instead of (a,b) -> a.compareTo(b)
        System.out.println("Sorted: " + names);
        names.forEach(System.out::println); // method reference for printing
    }

}
