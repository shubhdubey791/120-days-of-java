/**
 * ============================================
 * 120 Days of Java Learning - Day 96
 * Topic: ExecutorServiceThreadPool
 * ============================================
 * ExecutorService thread pool manage karta hai - manually thread create/destroy nahi karna padta.
 * java.util.concurrent package ka part hai, performance ke liye better hai.
 */
public class Day096_ExecutorServiceThreadPool {

    public static void main(String[] args) {

        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(2);
        executor.submit(() -> System.out.println("Task 1 running via thread pool"));
        executor.submit(() -> System.out.println("Task 2 running via thread pool"));
        executor.shutdown();
    }

}
