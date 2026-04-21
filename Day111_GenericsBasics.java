/**
 * ============================================
 * 120 Days of Java Learning - Day 111
 * Topic: GenericsBasics
 * ============================================
 * Generics type-safe code likhne deta hai, compile time par type checking hoti hai.
 * <T> type parameter represent karta hai - classes, interfaces, methods generic ho sakte hain.
 */
public class Day111_GenericsBasics {

    public static void main(String[] args) {

        class Box<T> {
            private T item;
            void set(T item) { this.item = item; }
            T get() { return item; }
        }
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println("Box content: " + stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Box content: " + intBox.get());
    }

}
