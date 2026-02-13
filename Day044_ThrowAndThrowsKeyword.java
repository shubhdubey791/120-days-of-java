/**
 * ============================================
 * 120 Days of Java Learning - Day 44
 * Topic: ThrowAndThrowsKeyword
 * ============================================
 * 'throw' ek exception ko explicitly generate karne ke liye use hota hai.
 * 'throws' method signature me batata hai ki ye exception throw kar sakta hai.
 */
public class Day044_ThrowAndThrowsKeyword {

    public static void main(String[] args) {

        class Validator {
            static void checkAge(int age) throws IllegalArgumentException {
                if (age < 18) throw new IllegalArgumentException("Age must be 18+");
                System.out.println("Age is valid: " + age);
            }
        }
        try {
            Validator.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

}
