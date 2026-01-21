/**
 * ============================================
 * 120 Days of Java Learning - Day 21
 * Topic: ClassesAndObjects
 * ============================================
 * Class ek blueprint hai jisse objects banaye jate hain.
 * Object class ka real-world instance hota hai jisme actual data hota hai.
 */
public class Day021_ClassesAndObjects {

    public static void main(String[] args) {

        class Car {
            String model = "Tesla";
            int speed = 200;
        }
        Car myCar = new Car();
        System.out.println("Model: " + myCar.model + ", Speed: " + myCar.speed);
    }

}
