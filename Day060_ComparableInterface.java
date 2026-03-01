/**
 * ============================================
 * 120 Days of Java Learning - Day 60
 * Topic: ComparableInterface
 * ============================================
 * Comparable interface custom objects ko natural order me sort karne deta hai.
 * compareTo() method implement karna padta hai.
 */
public class Day060_ComparableInterface {

    public static void main(String[] args) {

        class Student implements Comparable<Student> {
            String name; int marks;
            Student(String n, int m) { name = n; marks = m; }
            public int compareTo(Student other) { return this.marks - other.marks; }
            public String toString() { return name + "(" + marks + ")"; }
        }
        java.util.List<Student> students = new java.util.ArrayList<>();
        students.add(new Student("Shubh", 85));
        students.add(new Student("Amit", 92));
        java.util.Collections.sort(students);
        System.out.println("Sorted by marks: " + students);
    }

}
