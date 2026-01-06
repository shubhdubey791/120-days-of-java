/**
 * ============================================
 * 120 Days of Java Learning - Day 6
 * Topic: TypeCasting
 * ============================================
 * Type casting ek data type ko dusre me convert karna hota hai.
 * Widening (implicit): chhoti type se badi type me automatic conversion.
 * Narrowing (explicit): badi type se chhoti type me manual conversion karni padti hai.
 */
public class Day006_TypeCasting {

    public static void main(String[] args) {

        int num = 100;
        double dNum = num; // widening (implicit)
        System.out.println("Widening: int to double = " + dNum);

        double price = 99.99;
        int intPrice = (int) price; // narrowing (explicit)
        System.out.println("Narrowing: double to int = " + intPrice);
    }

}
