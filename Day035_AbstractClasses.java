/**
 * ============================================
 * 120 Days of Java Learning - Day 35
 * Topic: AbstractClasses
 * ============================================
 * Abstract class me abstract methods (bina body ke) ho sakte hain.
 * Abstract class ka object nahi ban sakta, sirf extend hoti hai.
 */
public class Day035_AbstractClasses {

    public static void main(String[] args) {

        abstract class Shape {
            abstract double area();
            void display() { System.out.println("Area: " + area()); }
        }
        class Square extends Shape {
            double side = 4;
            double area() { return side * side; }
        }
        new Square().display();
    }

}
