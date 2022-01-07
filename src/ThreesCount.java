/*
Ryan Chien
Period 4
Arrays Practice
ThreesCount
 */

import java.util.Random;

public class ThreesCount {
    public static void main(String[] args) {
        // create random object
        Random random = new Random();
        // create array
        int[] array = new int[10];
        // populate array
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
        // print array
        for (int num : array) {
            System.out.print(num + "\t");
        }
        System.out.print("\n");
        // count 3's
        int threes = 0;
        for (int num : array) {
            if (num == 3) {
                threes++;
            }
        }
        if (threes == 3) {
            System.out.println("There are 3 3's");
        }
    }
}
