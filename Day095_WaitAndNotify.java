/**
 * ============================================
 * 120 Days of Java Learning - Day 95
 * Topic: WaitAndNotify
 * ============================================
 * wait() thread ko temporarily suspend karta hai, notify() usse wake up karta hai.
 * Inter-thread communication ke liye use hote hain, synchronized block me hi call ho sakte hain.
 */
public class Day095_WaitAndNotify {

    public static void main(String[] args) {

        System.out.println("wait() - current thread ko lock release karke wait karwata hai");
        System.out.println("notify() - ek waiting thread ko wake up karta hai");
        System.out.println("notifyAll() - saare waiting threads ko wake up karta hai");
        System.out.println("Ye producer-consumer jaise problems solve karne me use hote hain");
    }

}
