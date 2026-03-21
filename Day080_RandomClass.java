/**
 * ============================================
 * 120 Days of Java Learning - Day 80
 * Topic: RandomClass
 * ============================================
 * Random class random numbers generate karne ke liye use hoti hai (java.util package).
 * nextInt(), nextDouble(), nextBoolean() common methods hain.
 */
public class Day080_RandomClass {

    public static void main(String[] args) {

        java.util.Random rand = new java.util.Random(42); // seed for reproducibility
        System.out.println("Random int (0-99): " + rand.nextInt(100));
        System.out.println("Random double: " + rand.nextDouble());
        System.out.println("Random boolean: " + rand.nextBoolean());
    }

}
