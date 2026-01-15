/**
 * ============================================
 * 120 Days of Java Learning - Day 15
 * Topic: NestedLoops
 * ============================================
 * Loop ke andar loop ko nested loop kehte hain.
 * Common use: patterns print karna, 2D array traverse karna.
 */
public class Day015_NestedLoops {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
