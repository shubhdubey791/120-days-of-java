/**
 * ============================================
 * 120 Days of Java Learning - Day 68
 * Topic: DequeInterface
 * ============================================
 * Deque (Double Ended Queue) dono ends se insert/remove allow karta hai.
 * Stack aur Queue dono ka behavior implement karne ke liye use ho sakta hai.
 */
public class Day068_DequeInterface {

    public static void main(String[] args) {

        java.util.Deque<Integer> deque = new java.util.ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        System.out.println("Deque: " + deque);
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());
    }

}
