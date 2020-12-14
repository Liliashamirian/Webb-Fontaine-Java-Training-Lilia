package week3;

import java.util.Arrays;

/**
 * Created by Lilia Shamirian on  26, Sep, 2020
 */
public class Ex4 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }

        System.out.println("Array 1 : " + Arrays.toString(array1));
        System.out.println("Array 2 : " + Arrays.toString(array2));
        System.out.println("Combined Array Is : " + Arrays.toString(combineTwoArrays(array1, array2)));
        System.out.println();
        System.out.println("Sum of Two Arrays Average is : " + sumOfTwoArraysAverage(array1, array2));

    }

    private static int[] combineTwoArrays(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length, j = 0; j < array2.length; i++, j++) {
            array3[i] = array2[j];
        }
        return array3;
    }

    private static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double avg = sum / array.length;
        return avg;
    }

    private static double sumOfTwoArraysAverage(int[] array1, int[] array2) {
        double avg1 = calculateAverage(array1);
        double avg2 = calculateAverage(array2);
        double sumOfAvg = avg1 + avg2;
        return sumOfAvg;
    }
}