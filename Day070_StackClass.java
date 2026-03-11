/**
 * ============================================
 * 120 Days of Java Learning - Day 70
 * Topic: StackClass
 * ============================================
 * Stack LIFO (Last-In-First-Out) principle follow karta hai.
 * push() se add, pop() se remove aur peek() se top element dekhte hain.
 */
public class Day070_StackClass {

    public static void main(String[] args) {

        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek after pop: " + stack.peek());
    }

}
