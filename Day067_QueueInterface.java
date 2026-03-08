/**
 * ============================================
 * 120 Days of Java Learning - Day 67
 * Topic: QueueInterface
 * ============================================
 * Queue FIFO (First-In-First-Out) principle follow karta hai.
 * offer() se add, poll() se remove aur peek() se front element dekhte hain.
 */
public class Day067_QueueInterface {

    public static void main(String[] args) {

        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queue: " + queue);
        System.out.println("Poll (remove front): " + queue.poll());
        System.out.println("Peek (front element): " + queue.peek());
    }

}
