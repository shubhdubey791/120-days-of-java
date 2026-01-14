/**
 * ============================================
 * 120 Days of Java Learning - Day 14
 * Topic: BreakAndContinue
 * ============================================
 * break loop ko turant terminate kar deta hai.
 * continue current iteration ko skip karke agli iteration par chala jata hai.
 */
public class Day014_BreakAndContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 6) break;
            if (i % 2 == 0) continue;
            System.out.println("Odd number: " + i);
        }
    }

}
