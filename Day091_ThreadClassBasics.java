/**
 * ============================================
 * 120 Days of Java Learning - Day 91
 * Topic: ThreadClassBasics
 * ============================================
 * Thread Java me program ka smallest execution unit hai (lightweight process).
 * Thread class ko extend karke run() method override karte hain.
 */
public class Day091_ThreadClassBasics {

    public static void main(String[] args) {

        class MyThread extends Thread {
            public void run() { System.out.println("Thread running: " + Thread.currentThread().getName()); }
        }
        MyThread t = new MyThread();
        t.start(); // start() naya thread banata hai, run() nahi direct call karte
    }

}
