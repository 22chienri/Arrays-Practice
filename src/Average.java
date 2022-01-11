/*
Ryan Chien
Period 4
Arrays Practice
Average
 */

import java.util.Random;

public class Average {
    public static void main(String[] args) {
        // create random object
        Random random = new Random();
        // create array
        int[] array = new int[20];
        // populate array
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        // calculate average
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double)sum / array.length;
        System.out.println(average);
    }
}
