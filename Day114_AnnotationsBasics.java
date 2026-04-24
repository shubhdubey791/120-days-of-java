/**
 * ============================================
 * 120 Days of Java Learning - Day 114
 * Topic: AnnotationsBasics
 * ============================================
 * Annotations metadata provide karte hain code ke bare me, compiler/JVM/tools ke liye.
 * @Override, @Deprecated, @SuppressWarnings built-in common annotations hain.
 */
public class Day114_AnnotationsBasics {

    public static void main(String[] args) {

        System.out.println("@Override - method parent class ko override kar raha hai, verify karta hai");
        System.out.println("@Deprecated - method/class ab use nahi karni chahiye, warning deta hai");
        System.out.println("@SuppressWarnings - compiler warnings ko suppress karta hai");
        System.out.println("Custom annotations bhi @interface keyword se ban sakti hain");
    }

}
