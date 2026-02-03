/**
 * ============================================
 * 120 Days of Java Learning - Day 34
 * Topic: Polymorphism
 * ============================================
 * Polymorphism ka matlab 'ek naam, kai roop' - same method call, alag behavior.
 * Do types: Compile-time (overloading) aur Runtime (overriding).
 */
public class Day034_Polymorphism {

    public static void main(String[] args) {

        class Animal {
            void sound() { System.out.println("Animal makes a sound"); }
        }
        class Cat extends Animal {
            void sound() { System.out.println("Cat meows"); }
        }
        class Cow extends Animal {
            void sound() { System.out.println("Cow moos"); }
        }
        Animal[] animals = {new Cat(), new Cow()};
        for (Animal a : animals) a.sound(); // runtime polymorphism
    }

}
