/**
 * ============================================
 * 120 Days of Java Learning - Day 89
 * Topic: JavaNioBasics
 * ============================================
 * java.nio (New IO) package modern, efficient file handling ke liye Java 7+ me aaya.
 * Files aur Paths classes traditional java.io se zyada powerful hain.
 */
public class Day089_JavaNioBasics {

    public static void main(String[] args) {

        java.nio.file.Path path = java.nio.file.Paths.get("temp_day89.txt");
        try {
            java.nio.file.Files.write(path, "NIO based file writing".getBytes());
            System.out.println("File content: " + new String(java.nio.file.Files.readAllBytes(path)));
        } catch (java.io.IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
