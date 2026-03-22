/**
 * ============================================
 * 120 Days of Java Learning - Day 81
 * Topic: FileClassBasics
 * ============================================
 * File class java.io package me hai, files/directories ko represent karti hai.
 * exists(), createNewFile(), delete(), mkdir() jaise methods available hain.
 */
public class Day081_FileClassBasics {

    public static void main(String[] args) {

        java.io.File file = new java.io.File("demo.txt");
        System.out.println("File path: " + file.getAbsolutePath());
        System.out.println("Exists: " + file.exists());
        System.out.println("Is directory: " + file.isDirectory());
    }

}
