/**
 * ============================================
 * 120 Days of Java Learning - Day 46
 * Topic: ExceptionHierarchy
 * ============================================
 * Throwable ke do main children hain: Error aur Exception.
 * Exception ke aage Checked (compile-time) aur Unchecked (runtime) exceptions hote hain.
 */
public class Day046_ExceptionHierarchy {

    public static void main(String[] args) {

        System.out.println("Throwable");
        System.out.println("  -> Error (e.g. OutOfMemoryError)");
        System.out.println("  -> Exception");
        System.out.println("       -> Checked (IOException, SQLException)");
        System.out.println("       -> Unchecked/RuntimeException (NullPointerException, ArithmeticException)");
    }

}
