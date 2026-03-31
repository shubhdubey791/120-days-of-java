/**
 * ============================================
 * 120 Days of Java Learning - Day 90
 * Topic: PathAndFilesClass
 * ============================================
 * Path interface file/directory location represent karta hai (java.nio.file package).
 * Files class me static utility methods hain - exists(), copy(), delete(), size() etc.
 */
public class Day090_PathAndFilesClass {

    public static void main(String[] args) {

        java.nio.file.Path p = java.nio.file.Paths.get("temp_day89.txt");
        System.out.println("File exists: " + java.nio.file.Files.exists(p));
        try {
            System.out.println("File size (bytes): " + java.nio.file.Files.size(p));
        } catch (java.io.IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
