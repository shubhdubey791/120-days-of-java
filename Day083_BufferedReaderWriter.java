/**
 * ============================================
 * 120 Days of Java Learning - Day 83
 * Topic: BufferedReaderWriter
 * ============================================
 * BufferedReader/Writer performance improve karte hain kyunki wo buffer me data hold karte hain.
 * readLine() method line-by-line file padhne ke liye useful hai.
 */
public class Day083_BufferedReaderWriter {

    public static void main(String[] args) {

        try {
            java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter("temp_day83.txt"));
            bw.write("Line 1 - Buffered writing");
            bw.newLine();
            bw.write("Line 2 - Efficient IO");
            bw.close();
            System.out.println("Buffered write complete");
        } catch (java.io.IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
