/**
 * ============================================
 * 120 Days of Java Learning - Day 65
 * Topic: ComparatorInterface
 * ============================================
 * Comparator custom sorting logic define karta hai, class ke bahar se.
 * Comparable se alag - multiple sorting criteria bana sakte hain.
 */
public class Day065_ComparatorInterface {

    public static void main(String[] args) {

        class Student {
            String name; int marks;
            Student(String n, int m) { name = n; marks = m; }
            public String toString() { return name + "(" + marks + ")"; }
        }
        java.util.List<Student> list = new java.util.ArrayList<>();
        list.add(new Student("Shubh", 85));
        list.add(new Student("Amit", 92));
        list.sort((s1, s2) -> s2.marks - s1.marks); // descending via Comparator lambda
        System.out.println("Sorted descending: " + list);
    }

}
