/**
 * ============================================
 * 120 Days of Java Learning - Day 87
 * Topic: ScannerForFileReading
 * ============================================
 * Scanner class sirf console input hi nahi, files padhne ke liye bhi use ho sakta hai.
 * new Scanner(File) constructor se file ko wrap kar sakte hain.
 */
public class Day087_ScannerForFileReading {

    public static void main(String[] args) {

        try {
            java.io.FileWriter fw = new java.io.FileWriter("temp_day87.txt");
            fw.write("Line A\nLine B\nLine C");
            fw.close();
            java.util.Scanner fileScanner = new java.util.Scanner(new java.io.File("temp_day87.txt"));
            while (fileScanner.hasNextLine()) {
                System.out.println("Read: " + fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (java.io.IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
