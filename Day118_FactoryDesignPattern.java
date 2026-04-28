/**
 * ============================================
 * 120 Days of Java Learning - Day 118
 * Topic: FactoryDesignPattern
 * ============================================
 * Factory pattern object creation logic ko ek jagah centralize karta hai.
 * Client ko exact class pata karne ki zaroorat nahi hoti, factory decide karti hai kaunsa object banana hai.
 */
public class Day118_FactoryDesignPattern {

    public static void main(String[] args) {

        interface Shape { void draw(); }
        class Circle implements Shape { public void draw() { System.out.println("Drawing Circle"); } }
        class Square implements Shape { public void draw() { System.out.println("Drawing Square"); } }

        class ShapeFactory {
            static Shape getShape(String type) {
                if (type.equals("circle")) return new Circle();
                else if (type.equals("square")) return new Square();
                return null;
            }
        }
        Shape shape = ShapeFactory.getShape("circle");
        shape.draw();
    }

}
