/**
 * ============================================
 * 120 Days of Java Learning - Day 85
 * Topic: SerializationBasics
 * ============================================
 * Serialization object ko byte stream me convert karta hai, taki file me save ya network par bheja ja sake.
 * Class ko Serializable interface implement karna zaroori hai.
 */
public class Day085_SerializationBasics {

    public static void main(String[] args) {

        class Student implements java.io.Serializable {
            String name; int age;
            Student(String n, int a) { name = n; age = a; }
        }
        System.out.println("Serializable interface object ko byte stream me convert karne ke liye marker interface hai");
        Student s = new Student("Shubh", 21);
        System.out.println("Student object ready for serialization: " + s.name);
    }

}
