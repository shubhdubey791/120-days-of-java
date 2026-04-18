/**
 * ============================================
 * 120 Days of Java Learning - Day 108
 * Topic: DefaultMethodsInInterface
 * ============================================
 * Java 8 se interfaces me default methods (with body) allow ho gaye.
 * Backward compatibility maintain karne ke liye introduce kiye gaye - implementing classes ko override karna optional hai.
 */
public class Day108_DefaultMethodsInInterface {

    public static void main(String[] args) {

        interface Vehicle {
            void drive();
            default void honk() { System.out.println("Beep beep! (default method)"); }
        }
        class Car implements Vehicle {
            public void drive() { System.out.println("Car is driving"); }
        }
        Car car = new Car();
        car.drive();
        car.honk(); // inherited default method, no need to override
    }

}
