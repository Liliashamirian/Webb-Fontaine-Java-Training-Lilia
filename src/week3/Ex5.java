package week3;

import java.util.Arrays;

/**
 * Created by Lilia Shamirian on  26, Sep, 2020
 */
public class Ex5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Initial Array : " + Arrays.toString(array));
        System.out.println();
        String strDouble = String.format("%.1f", increaseGivenElementByTenPercent(2, array));
        System.out.print(strDouble + ", ");
    }

    private static double increaseGivenElementByTenPercent(int index, int[] array) {
        return array[index] * 0.10;
    }
}