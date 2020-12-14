package week3;

import java.util.Arrays;

/**
 * Created by Lilia Shamirian on  26, Sep, 2020
 */
public class Ex1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Initial Array : " + Arrays.toString(array));
        System.out.println();
        System.out.println("Initial Array : " + Arrays.toString(doubleArrayElements(array)));

    }

    private static int[] doubleArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
        return array;
    }
}