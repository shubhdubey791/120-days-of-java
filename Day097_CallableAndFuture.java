/**
 * ============================================
 * 120 Days of Java Learning - Day 97
 * Topic: CallableAndFuture
 * ============================================
 * Callable, Runnable jaisa hi hai lekin value return kar sakta hai aur exception throw kar sakta hai.
 * Future object se Callable ka result baad me retrieve kiya ja sakta hai.
 */
public class Day097_CallableAndFuture {

    public static void main(String[] args) {

        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();
        java.util.concurrent.Future<Integer> future = executor.submit(() -> {
            Thread.sleep(50);
            return 10 * 10;
        });
        try {
            System.out.println("Callable result: " + future.get());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        executor.shutdown();
    }

}
