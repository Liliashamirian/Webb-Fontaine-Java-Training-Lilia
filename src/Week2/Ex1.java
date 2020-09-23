package Week2;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  14, Sep, 2020
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Fill the array");
        if (scanner.hasNextInt()) {
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("The Reversed Array is: ");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Please enter numeric data: ");
        }
    }
}