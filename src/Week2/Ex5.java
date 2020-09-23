package Week2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  22, Sep, 2020
 */
public class Ex5 {
    public static void main(String[] args) {
       /* Scanner s = new Scanner(System.in);

        System.out.println("please enter a number");

        int x = s.nextInt();

        String[] str = Integer.toString(x).split("");

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");

        }*/

        Scanner s = new Scanner(System.in);

        System.out.println("please enter a number");
        if (s.hasNextInt()) {
            int x = s.nextInt();
            int arrayLength = String.valueOf(x).length();
            int[] array = new int[arrayLength];
            for (int i = arrayLength - 1; x > 0; x /= 10, --i) {
                array[i] = x % 10;
            }
            System.out.println("Converted Array: " + Arrays.toString(array));
        } else {
            System.out.println("Please Enter An Integer");
        }

    }
}