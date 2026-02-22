/**
 * ============================================
 * 120 Days of Java Learning - Day 53
 * Topic: LinkedListBasics
 * ============================================
 * LinkedList doubly-linked list implementation hai, List aur Deque dono interface implement karta hai.
 * Insertion/deletion ArrayList se fast hoti hai, random access slow hota hai.
 */
public class Day053_LinkedListBasics {

    public static void main(String[] args) {

        java.util.LinkedList<Integer> numbers = new java.util.LinkedList<>();
        numbers.add(10);
        numbers.addFirst(5);
        numbers.addLast(15);
        System.out.println("LinkedList: " + numbers);
        System.out.println("First: " + numbers.getFirst() + " Last: " + numbers.getLast());
    }

}
