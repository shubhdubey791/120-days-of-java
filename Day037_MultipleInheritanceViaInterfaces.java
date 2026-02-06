/**
 * ============================================
 * 120 Days of Java Learning - Day 37
 * Topic: MultipleInheritanceViaInterfaces
 * ============================================
 * Java classes ke through multiple inheritance support nahi karta (diamond problem se bachne ke liye).
 * Lekin interfaces ke through ek class multiple interfaces implement kar sakti hai.
 */
public class Day037_MultipleInheritanceViaInterfaces {

    public static void main(String[] args) {

        interface Flyable { void fly(); }
        interface Swimmable { void swim(); }
        class Duck implements Flyable, Swimmable {
            public void fly() { System.out.println("Duck flies"); }
            public void swim() { System.out.println("Duck swims"); }
        }
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }

}
