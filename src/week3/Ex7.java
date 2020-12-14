package week3;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  26, Sep, 2020
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number=");
        int num = input.nextInt();
        System.out.println("The Factorial is : " + factorial(num));

    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}