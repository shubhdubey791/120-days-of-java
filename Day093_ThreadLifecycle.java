/**
 * ============================================
 * 120 Days of Java Learning - Day 93
 * Topic: ThreadLifecycle
 * ============================================
 * Thread ke 5 states hote hain: New, Runnable, Running, Blocked/Waiting, Terminated.
 * getState() method se current state pata kar sakte hain.
 */
public class Day093_ThreadLifecycle {

    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        });
        System.out.println("State before start: " + t.getState()); // NEW
        t.start();
        System.out.println("State after start: " + t.getState()); // RUNNABLE
    }

}
