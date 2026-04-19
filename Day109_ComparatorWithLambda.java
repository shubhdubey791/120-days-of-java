/**
 * ============================================
 * 120 Days of Java Learning - Day 109
 * Topic: ComparatorWithLambda
 * ============================================
 * Comparator ko lambda expressions ke saath likhna bahut concise ho jata hai.
 * thenComparing() se multiple sorting criteria chain kar sakte hain.
 */
public class Day109_ComparatorWithLambda {

    public static void main(String[] args) {

        class Employee {
            String name; int age;
            Employee(String n, int a) { name = n; age = a; }
            public String toString() { return name + "(" + age + ")"; }
        }
        java.util.List<Employee> emps = new java.util.ArrayList<>();
        emps.add(new Employee("Shubh", 21));
        emps.add(new Employee("Amit", 25));
        emps.sort(java.util.Comparator.comparing((Employee e) -> e.age).reversed());
        System.out.println("Sorted by age desc: " + emps);
    }

}
