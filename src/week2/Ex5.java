package week2;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  22, Sep, 2020
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("please enter a number");

        int x = s.nextInt();

        String[] str = Integer.toString(x).split("");

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");

        }
    }
}