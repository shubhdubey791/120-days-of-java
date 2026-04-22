/**
 * ============================================
 * 120 Days of Java Learning - Day 112
 * Topic: BoundedGenerics
 * ============================================
 * Bounded generics generic type par restriction lagate hain (extends keyword se).
 * <T extends Number> ka matlab T sirf Number ya uski subclass ho sakti hai.
 */
public class Day112_BoundedGenerics {

    public static void main(String[] args) {

        class Calculator<T extends Number> {
            T value;
            Calculator(T value) { this.value = value; }
            double doubleValue() { return value.doubleValue() * 2; }
        }
        Calculator<Integer> calc = new Calculator<>(10);
        System.out.println("Doubled value: " + calc.doubleValue());
    }

}
