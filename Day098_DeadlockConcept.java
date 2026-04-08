/**
 * ============================================
 * 120 Days of Java Learning - Day 98
 * Topic: DeadlockConcept
 * ============================================
 * Deadlock tab hota hai jab do ya zyada threads ek dusre ke resource ka indefinitely wait karte hain.
 * Avoid karne ke liye: consistent lock ordering, timeout use karna common strategies hain.
 */
public class Day098_DeadlockConcept {

    public static void main(String[] args) {

        System.out.println("Deadlock example: Thread A locks Resource1, waits for Resource2");
        System.out.println("                   Thread B locks Resource2, waits for Resource1");
        System.out.println("Result: Both threads stuck forever - classic deadlock scenario");
        System.out.println("Prevention: always acquire locks in the same order across threads");
    }

}
