package Week2;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  16, Sep, 2020
 */
public class Ex4 {
    public static void main(String[] args) {
        int[] array = {8, 2, 2, 5, 2, 2, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        getKtimesRepeatedElement(2, array);
    }

    static void getKtimesRepeatedElement(int k, int[] array) {

        for (int i = 0; i < array.length; i++) {
            int x = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    x++;
                }
            }
            if (x == k) {
                System.out.println("K Times Repeated element is : " + array[i]);
                break;
            }
        }
    }
}