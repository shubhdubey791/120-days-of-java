/**
 * ============================================
 * 120 Days of Java Learning - Day 74
 * Topic: RegexBasics
 * ============================================
 * Regex (Regular Expressions) pattern matching ke liye use hota hai.
 * String class me matches() method basic regex check ke liye milta hai.
 */
public class Day074_RegexBasics {

    public static void main(String[] args) {

        String email = "shubh@example.com";
        boolean isValid = email.matches("^[\\w.]+@[\\w]+\\.[a-z]+$");
        System.out.println("Is valid email: " + isValid);

        String phone = "9876543210";
        System.out.println("Is 10-digit number: " + phone.matches("\\d{10}"));
    }

}
