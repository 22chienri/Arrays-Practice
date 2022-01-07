/*
Ryan Chien
Period 4
Arrays Practice
EvensCount
 */

import java.util.Random;

public class EvensCount {
    public static void main(String[] args) {
        // create random object
        Random random = new Random();
        // create matrix
        int[][] matrix = new int[5][6];
        // populate matrix with random numbers
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[r][c] = random.nextInt(51);
            }
        }
        // print matrix
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.printf("%s\t", matrix[r][c]);
            }
            System.out.print("\n");
        }
        // count evens
        int evens = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] % 2 == 0) {
                    evens++;
                }
            }
        }
        System.out.println("Amount of evens: " + evens);
    }
}
