/**
 * ============================================
 * 120 Days of Java Learning - Day 48
 * Topic: TryWithResources
 * ============================================
 * try-with-resources automatically resources ko close kar deta hai (Java 7+).
 * Resource ko AutoCloseable interface implement karna chahiye.
 */
public class Day048_TryWithResources {

    public static void main(String[] args) {

        class MyResource implements AutoCloseable {
            void use() { System.out.println("Using resource"); }
            public void close() { System.out.println("Resource closed automatically"); }
        }
        try (MyResource res = new MyResource()) {
            res.use();
        }
    }

}
