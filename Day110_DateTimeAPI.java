/**
 * ============================================
 * 120 Days of Java Learning - Day 110
 * Topic: DateTimeAPI
 * ============================================
 * java.time package (Java 8+) modern, immutable Date/Time API provide karta hai.
 * LocalDate, LocalTime, LocalDateTime common classes hain - old Date/Calendar se better hain.
 */
public class Day110_DateTimeAPI {

    public static void main(String[] args) {

        java.time.LocalDate today = java.time.LocalDate.now();
        java.time.LocalDate futureDate = today.plusDays(30);
        System.out.println("Today: " + today);
        System.out.println("30 days from now: " + futureDate);
        System.out.println("Day of week: " + today.getDayOfWeek());
    }

}
