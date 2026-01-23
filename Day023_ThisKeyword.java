/**
 * ============================================
 * 120 Days of Java Learning - Day 23
 * Topic: ThisKeyword
 * ============================================
 * 'this' current object ko refer karta hai.
 * Mostly instance variable aur parameter ke naam same hone par confusion door karne ke liye use hota hai.
 */
public class Day023_ThisKeyword {

    public static void main(String[] args) {

        class Person {
            String name;
            Person(String name) {
                this.name = name; // this.name = instance var, name = parameter
            }
        }
        Person p = new Person("Dubey");
        System.out.println("Name: " + p.name);
    }

}
