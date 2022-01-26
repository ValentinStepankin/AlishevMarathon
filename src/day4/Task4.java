/*
Show the largest sum of three adjacent numbers in an array and the index of the first element.
 */

package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int maxSum = 0;
        int sum;
        int firstElementIndex = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = (new Random()).nextInt(10);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length-2; i++){
            sum = array[i] + array[i+1] + array[i+2];
            if (maxSum<=sum){
                maxSum=sum;
                firstElementIndex = i;
            }
        }

        System.out.println("The largest sum of three adjacent numbers " + maxSum);
        System.out.println("First element index " + firstElementIndex);
    }
}
