/**
 * ============================================
 * 120 Days of Java Learning - Day 73
 * Topic: StringPoolConcept
 * ============================================
 * String literals JVM ke special memory area 'String Pool' me store hote hain.
 * 'new String()' se banaya gaya string pool me nahi, heap me store hota hai.
 */
public class Day073_StringPoolConcept {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello"; // same pool reference use karega
        String s3 = new String("Hello"); // naya object heap me
        System.out.println("s1 == s2: " + (s1 == s2)); // true - pool
        System.out.println("s1 == s3: " + (s1 == s3)); // false - heap
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true - content same
    }

}
