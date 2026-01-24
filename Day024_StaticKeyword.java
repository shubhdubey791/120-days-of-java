/**
 * ============================================
 * 120 Days of Java Learning - Day 24
 * Topic: StaticKeyword
 * ============================================
 * static member class-level hota hai, sabhi objects me share hota hai.
 * static method object banaye bina call ho sakta hai.
 */
public class Day024_StaticKeyword {

    public static void main(String[] args) {

        class Counter {
            static int count = 0;
            Counter() { count++; }
        }
        new Counter(); new Counter(); new Counter();
        System.out.println("Total objects created: " + Counter.count);
    }

}
