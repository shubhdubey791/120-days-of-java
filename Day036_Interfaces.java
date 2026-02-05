/**
 * ============================================
 * 120 Days of Java Learning - Day 36
 * Topic: Interfaces
 * ============================================
 * Interface ek pure abstract type hai - 100% abstraction (Java 8 se default/static methods bhi allowed).
 * Class 'implements' keyword se interface implement karti hai, methods define karna zaroori hai.
 */
public class Day036_Interfaces {

    public static void main(String[] args) {

        interface Drawable {
            void draw();
        }
        class Rectangle implements Drawable {
            public void draw() { System.out.println("Drawing a rectangle"); }
        }
        Drawable d = new Rectangle();
        d.draw();
    }

}
