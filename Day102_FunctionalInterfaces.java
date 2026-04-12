/**
 * ============================================
 * 120 Days of Java Learning - Day 102
 * Topic: FunctionalInterfaces
 * ============================================
 * Functional interface me sirf ek abstract method hota hai (@FunctionalInterface annotation optional).
 * Predicate, Function, Consumer, Supplier - java.util.function ke common interfaces hain.
 */
public class Day102_FunctionalInterfaces {

    public static void main(String[] args) {

        java.util.function.Predicate<Integer> isEven = n -> n % 2 == 0;
        java.util.function.Function<Integer, Integer> square = n -> n * n;
        java.util.function.Consumer<String> printer = s -> System.out.println("Consumed: " + s);

        System.out.println("Is 8 even? " + isEven.test(8));
        System.out.println("Square of 5: " + square.apply(5));
        printer.accept("Hello Functional Interfaces");
    }

}
