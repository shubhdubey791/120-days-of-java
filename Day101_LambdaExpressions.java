/**
 * ============================================
 * 120 Days of Java Learning - Day 101
 * Topic: LambdaExpressions
 * ============================================
 * Lambda expression ek anonymous function hai jo functional interface implement karta hai (Java 8+).
 * Syntax: (parameters) -> expression/body. Boilerplate code kam karta hai.
 */
public class Day101_LambdaExpressions {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Lambda running!");
        r.run();

        java.util.function.BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Lambda add(5,3): " + add.apply(5, 3));
    }

}
