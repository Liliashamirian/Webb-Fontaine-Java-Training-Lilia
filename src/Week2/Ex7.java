package Week2;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  22, Sep, 2020
 */
public class Ex7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int temp;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print("[ " + array[i] + " ]");
        }
        System.out.println();
        System.out.println("Ascending sorted: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ " + array[i] + " ]");
        }
        System.out.println();
        System.out.println("Descending sorted: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ " + array[i] + " ]");
        }
    }
}