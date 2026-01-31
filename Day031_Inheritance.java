/**
 * ============================================
 * 120 Days of Java Learning - Day 31
 * Topic: Inheritance
 * ============================================
 * Inheritance ek class ko dusri class ki properties/methods use karne deta hai (extends keyword).
 * Parent class = superclass, Child class = subclass. Code reusability badhta hai.
 */
public class Day031_Inheritance {

    public static void main(String[] args) {

        class Animal {
            void eat() { System.out.println("Animal eats food"); }
        }
        class Dog extends Animal {
            void bark() { System.out.println("Dog barks"); }
        }
        Dog d = new Dog();
        d.eat();
        d.bark();
    }

}
