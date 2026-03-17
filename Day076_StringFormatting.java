/**
 * ============================================
 * 120 Days of Java Learning - Day 76
 * Topic: StringFormatting
 * ============================================
 * String.format() aur printf() formatted output banate hain (like C's printf).
 * %d integer, %s string, %f float, %n newline - common format specifiers hain.
 */
public class Day076_StringFormatting {

    public static void main(String[] args) {

        String name = "Shubh";
        int day = 76;
        double progress = 63.33;
        String formatted = String.format("Day %d: %s | Progress: %.2f%%", day, name, progress);
        System.out.println(formatted);
    }

}
