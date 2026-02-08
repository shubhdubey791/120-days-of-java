/**
 * ============================================
 * 120 Days of Java Learning - Day 39
 * Topic: InnerClasses
 * ============================================
 * Inner class kisi class ke andar defined class hoti hai.
 * Outer class ke members ko directly access kar sakti hai.
 */
public class Day039_InnerClasses {

    public static void main(String[] args) {

        class Outer {
            int outerVar = 10;
            class Inner {
                void display() { System.out.println("Accessing outer var: " + outerVar); }
            }
        }
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }

}
