/**
 * ============================================
 * 120 Days of Java Learning - Day 17
 * Topic: Arrays2D
 * ============================================
 * 2D array matrix ki tarah hota hai - rows aur columns ke saath.
 * Declaration: dataType[][] arrayName = new dataType[rows][cols];
 */
public class Day017_Arrays2D {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
