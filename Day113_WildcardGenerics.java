/**
 * ============================================
 * 120 Days of Java Learning - Day 113
 * Topic: WildcardGenerics
 * ============================================
 * Wildcard (?) unknown type represent karta hai - flexible method signatures ke liye.
 * ? extends T (upper bound), ? super T (lower bound) common patterns hain.
 */
public class Day113_WildcardGenerics {

    public static void main(String[] args) {

        java.util.List<Integer> intList = java.util.List.of(1, 2, 3);
        java.util.List<Double> doubleList = java.util.List.of(1.1, 2.2, 3.3);
        System.out.println("Sum of intList: " + sumOfList(intList));
        System.out.println("Sum of doubleList: " + sumOfList(doubleList));
    }

    static double sumOfList(java.util.List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

}
