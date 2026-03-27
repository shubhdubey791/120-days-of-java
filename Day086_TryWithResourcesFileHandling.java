/**
 * ============================================
 * 120 Days of Java Learning - Day 86
 * Topic: TryWithResourcesFileHandling
 * ============================================
 * File operations me try-with-resources use karna best practice hai - auto resource close ho jata hai.
 * Manual close() call karna bhool jaane se resource leak ho sakta hai.
 */
public class Day086_TryWithResourcesFileHandling {

    public static void main(String[] args) {

        try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter("temp_day86.txt"))) {
            bw.write("Auto-closing resource demo");
            System.out.println("File written, resource will auto-close");
        } catch (java.io.IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
