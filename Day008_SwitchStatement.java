/**
 * ============================================
 * 120 Days of Java Learning - Day 8
 * Topic: SwitchStatement
 * ============================================
 * switch statement multiple conditions ko handle karne ka clean tarika hai.
 * har case ke baad break lagana zaroori hai, warna fall-through ho jayega.
 * Java 14+ me switch expressions bhi aa gaye hain (arrow syntax).
 */
public class Day008_SwitchStatement {

    public static void main(String[] args) {

        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            default: System.out.println("Weekend");
        }
    }

}
