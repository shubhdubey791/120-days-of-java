/**
 * ============================================
 * 120 Days of Java Learning - Day 40
 * Topic: EnumInJava
 * ============================================
 * Enum ek special data type hai jo fixed set of constants define karta hai.
 * Type safety deta hai - jaise Days of week, Directions etc.
 */
public class Day040_EnumInJava {

    public static void main(String[] args) {

        enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);
        for (Day d : Day.values()) System.out.print(d + " ");
        System.out.println();
    }

}
