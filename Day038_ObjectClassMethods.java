/**
 * ============================================
 * 120 Days of Java Learning - Day 38
 * Topic: ObjectClassMethods
 * ============================================
 * Har Java class implicitly Object class ko extend karti hai.
 * toString(), equals(), hashCode() common overridden methods hain.
 */
public class Day038_ObjectClassMethods {

    public static void main(String[] args) {

        class Point {
            int x, y;
            Point(int x, int y) { this.x = x; this.y = y; }
            @Override
            public String toString() { return "Point(" + x + "," + y + ")"; }
        }
        Point p = new Point(3, 4);
        System.out.println("Point object: " + p); // toString() automatically called
    }

}
