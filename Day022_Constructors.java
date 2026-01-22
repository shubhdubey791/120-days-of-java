/**
 * ============================================
 * 120 Days of Java Learning - Day 22
 * Topic: Constructors
 * ============================================
 * Constructor ek special method hai jo object create hote hi call hota hai.
 * Constructor ka naam class ke naam jaisa hota hai, return type nahi hota.
 */
public class Day022_Constructors {

    public static void main(String[] args) {

        class Student {
            String name;
            Student(String n) { name = n; }
        }
        Student s1 = new Student("Shubh");
        System.out.println("Student name via constructor: " + s1.name);
    }

}
