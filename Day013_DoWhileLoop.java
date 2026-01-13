/**
 * ============================================
 * 120 Days of Java Learning - Day 13
 * Topic: DoWhileLoop
 * ============================================
 * do-while loop me pehle body execute hota hai, phir condition check hoti hai.
 * Isliye do-while kam se kam ek baar zaroor chalta hai, chahe condition false ho.
 */
public class Day013_DoWhileLoop {

    public static void main(String[] args) {

        int i = 1;
        do {
            System.out.println("Do-While iteration: " + i);
            i++;
        } while (i <= 5);
    }

}
