/**
 * ============================================
 * 120 Days of Java Learning - Day 117
 * Topic: SingletonDesignPattern
 * ============================================
 * Singleton pattern ensure karta hai ki class ka sirf ek hi instance exist kare.
 * Private constructor + static getInstance() method se implement hota hai.
 */
public class Day117_SingletonDesignPattern {

    public static void main(String[] args) {

        class Singleton {
            private static Singleton instance;
            private Singleton() {}
            static Singleton getInstance() {
                if (instance == null) instance = new Singleton();
                return instance;
            }
        }
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("Same instance? " + (s1 == s2));
    }

}
