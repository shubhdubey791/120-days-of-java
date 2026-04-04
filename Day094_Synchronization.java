/**
 * ============================================
 * 120 Days of Java Learning - Day 94
 * Topic: Synchronization
 * ============================================
 * Synchronization multiple threads ko shared resource ek saath access karne se rokta hai (race condition avoid).
 * 'synchronized' keyword method ya block par lagaya ja sakta hai.
 */
public class Day094_Synchronization {

    public static void main(String[] args) {

        class Counter {
            private int count = 0;
            synchronized void increment() { count++; }
            int getCount() { return count; }
        }
        Counter counter = new Counter();
        Runnable task = () -> { for (int i = 0; i < 1000; i++) counter.increment(); };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        try { t1.join(); t2.join(); } catch (InterruptedException e) {}
        System.out.println("Final count (synchronized, no race condition): " + counter.getCount());
    }

}
