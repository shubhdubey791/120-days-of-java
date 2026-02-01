/**
 * ============================================
 * 120 Days of Java Learning - Day 32
 * Topic: SuperKeyword
 * ============================================
 * 'super' parent class ke members ko refer karta hai.
 * super() se parent class ka constructor call kiya jata hai.
 */
public class Day032_SuperKeyword {

    public static void main(String[] args) {

        class Vehicle {
            Vehicle() { System.out.println("Vehicle constructor called"); }
            void info() { System.out.println("This is a vehicle"); }
        }
        class Bike extends Vehicle {
            Bike() {
                super(); // parent constructor call
                System.out.println("Bike constructor called");
            }
            void info() {
                super.info(); // parent method call
                System.out.println("This is a bike");
            }
        }
        new Bike().info();
    }

}
