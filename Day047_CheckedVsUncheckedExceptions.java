/**
 * ============================================
 * 120 Days of Java Learning - Day 47
 * Topic: CheckedVsUncheckedExceptions
 * ============================================
 * Checked exceptions compile time par check hoti hain, handle karna mandatory hai (jaise IOException).
 * Unchecked exceptions runtime par aati hain, handle karna optional hai (jaise NullPointerException).
 */
public class Day047_CheckedVsUncheckedExceptions {

    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length()); // Unchecked: NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Unchecked exception caught: " + e);
        }
    }

}
