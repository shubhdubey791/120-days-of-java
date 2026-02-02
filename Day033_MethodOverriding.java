/**
 * ============================================
 * 120 Days of Java Learning - Day 33
 * Topic: MethodOverriding
 * ============================================
 * Child class parent class ke method ko apne tarike se redefine kar sakti hai.
 * Runtime polymorphism ka example - @Override annotation use karna best practice hai.
 */
public class Day033_MethodOverriding {

    public static void main(String[] args) {

        class Shape {
            double area() { return 0; }
        }
        class Circle extends Shape {
            double radius = 5;
            @Override
            double area() { return Math.PI * radius * radius; }
        }
        Shape s = new Circle();
        System.out.println("Area of circle: " + s.area());
    }

}
