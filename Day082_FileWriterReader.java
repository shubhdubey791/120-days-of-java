/**
 * ============================================
 * 120 Days of Java Learning - Day 82
 * Topic: FileWriterReader
 * ============================================
 * FileWriter file me data likhne ke liye, FileReader file se data padhne ke liye use hota hai.
 * Character-based streams hain, byte streams (FileInputStream) se alag.
 */
public class Day082_FileWriterReader {

    public static void main(String[] args) {

        try {
            java.io.FileWriter fw = new java.io.FileWriter("temp_day82.txt");
            fw.write("Hello from Day 82 - FileWriter demo");
            fw.close();
            System.out.println("File written successfully");
        } catch (java.io.IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
