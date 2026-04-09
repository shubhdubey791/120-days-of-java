/**
 * ============================================
 * 120 Days of Java Learning - Day 99
 * Topic: ThreadPriority
 * ============================================
 * Har thread ki priority hoti hai (1 se 10), jo scheduler ko hint deti hai.
 * setPriority() se set kar sakte hain, lekin JVM/OS ke hisaab se guarantee nahi hoti.
 */
public class Day099_ThreadPriority {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> System.out.println("Low priority thread"));
        Thread t2 = new Thread(() -> System.out.println("High priority thread"));
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("t1 priority: " + t1.getPriority() + ", t2 priority: " + t2.getPriority());
        t1.start(); t2.start();
    }

}
