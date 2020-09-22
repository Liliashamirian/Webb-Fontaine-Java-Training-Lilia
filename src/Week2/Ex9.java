package Week2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  22, Sep, 2020
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int[] array2 = new int[array.length - 1];

        System.out.println("Please input index : ");
        int index = scanner.nextInt();

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            array2[j++] = array[i];
        }

        System.out.println("Array after deletion: " + Arrays.toString(array2));

    }
}