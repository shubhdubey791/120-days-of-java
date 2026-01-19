/**
 * ============================================
 * 120 Days of Java Learning - Day 19
 * Topic: StringMethodsPart1
 * ============================================
 * String class me kayi useful methods hote hain jaise charAt, substring, indexOf.
 * Ye sab methods naya string return karte hain kyunki String immutable hai.
 */
public class Day019_StringMethodsPart1 {

    public static void main(String[] args) {

        String s = "Java Programming";
        System.out.println("charAt(5): " + s.charAt(5));
        System.out.println("substring(5): " + s.substring(5));
        System.out.println("indexOf('P'): " + s.indexOf('P'));
        System.out.println("contains('Prog'): " + s.contains("Prog"));
    }

}
