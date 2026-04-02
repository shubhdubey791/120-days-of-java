/**
 * ============================================
 * 120 Days of Java Learning - Day 92
 * Topic: RunnableInterface
 * ============================================
 * Runnable interface implement karke bhi thread bana sakte hain (multiple inheritance possible).
 * Thread class extend karne se better practice mana jata hai.
 */
public class Day092_RunnableInterface {

    public static void main(String[] args) {

        class MyTask implements Runnable {
            public void run() { System.out.println("Task running via Runnable interface"); }
        }
        Thread t = new Thread(new MyTask());
        t.start();
    }

}
