/**
 * ============================================
 * 120 Days of Java Learning - Day 20
 * Topic: StringMethodsPart2
 * ============================================
 * trim(), replace(), split(), equals() aur equalsIgnoreCase() bhi common methods hain.
 * == operator reference compare karta hai, .equals() content compare karta hai.
 */
public class Day020_StringMethodsPart2 {

    public static void main(String[] args) {

        String s1 = "  Hello World  ";
        System.out.println("Trimmed: '" + s1.trim() + "'");
        System.out.println("Replaced: " + s1.trim().replace("World", "Java"));

        String[] parts = "a,b,c,d".split(",");
        System.out.println("Split length: " + parts.length);

        String x = "java", y = "JAVA";
        System.out.println("equalsIgnoreCase: " + x.equalsIgnoreCase(y));
    }

}
