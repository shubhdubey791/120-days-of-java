/**
 * ============================================
 * 120 Days of Java Learning - Day 25
 * Topic: MethodOverloading
 * ============================================
 * Same method naam, different parameters - isse method overloading kehte hain.
 * Compile-time polymorphism ka example hai.
 */
public class Day025_MethodOverloading {

    public static void main(String[] args) {

        class Calculator {
            int add(int a, int b) { return a + b; }
            double add(double a, double b) { return a + b; }
            int add(int a, int b, int c) { return a + b + c; }
        }
        Calculator calc = new Calculator();
        System.out.println("add(2,3) = " + calc.add(2, 3));
        System.out.println("add(2.5,3.5) = " + calc.add(2.5, 3.5));
        System.out.println("add(1,2,3) = " + calc.add(1, 2, 3));
    }

}
