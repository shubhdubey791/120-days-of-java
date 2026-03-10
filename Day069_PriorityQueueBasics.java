/**
 * ============================================
 * 120 Days of Java Learning - Day 69
 * Topic: PriorityQueueBasics
 * ============================================
 * PriorityQueue elements ko priority ke hisaab se order karta hai (default: natural/min-heap).
 * Har baar poll() smallest (ya custom comparator ke hisaab se) element return karta hai.
 */
public class Day069_PriorityQueueBasics {

    public static void main(String[] args) {

        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        pq.offer(30); pq.offer(10); pq.offer(20);
        System.out.println("PriorityQueue poll order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

}
