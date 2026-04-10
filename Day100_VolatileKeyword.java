/**
 * ============================================
 * 120 Days of Java Learning - Day 100
 * Topic: VolatileKeyword
 * ============================================
 * volatile keyword ensure karta hai ki variable ki value hamesha main memory se padhi jaye (cache nahi).
 * Multithreaded environment me visibility problem solve karta hai.
 */
public class Day100_VolatileKeyword {

    public static void main(String[] args) {

        class SharedFlag {
            volatile boolean running = true;
        }
        SharedFlag flag = new SharedFlag();
        System.out.println("volatile ensures all threads see the latest value of 'running'");
        System.out.println("Without volatile, a thread might cache stale value: " + flag.running);
    }

}
