/**
 * ============================================
 * 120 Days of Java Learning - Day 106
 * Topic: OptionalClass
 * ============================================
 * Optional ek container object hai jo value present ho ya na ho, dono handle karta hai.
 * NullPointerException avoid karne ke liye Java 8 me introduce hua.
 */
public class Day106_OptionalClass {

    public static void main(String[] args) {

        java.util.Optional<String> opt = java.util.Optional.of("Hello");
        System.out.println("Is present: " + opt.isPresent());
        System.out.println("Value: " + opt.get());

        java.util.Optional<String> empty = java.util.Optional.empty();
        System.out.println("Default if empty: " + empty.orElse("Default Value"));
    }

}
