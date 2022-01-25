/*
Ryan Chien
Period 4
Arrays Practice
Sums
 */

import java.util.Random;

public class Sums {
    public static void main(String[] args) {
        // create random object
        Random random = new Random();
        // assign random numbers
        int num1 = random.nextInt(51);
        int num2 = random.nextInt(51);
        // calculate sum
        int sum = num1 + num2;
        // check if between 21 and 29
        if (sum >= 21 && sum <= 29) {
            System.out.println("29");
        } else {
            System.out.println(sum);
        }
    }
}
