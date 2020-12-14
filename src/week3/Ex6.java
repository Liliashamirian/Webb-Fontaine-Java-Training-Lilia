package week3;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  26, Sep, 2020
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        System.out.println("The Fibonacci Number is: " + fibo(num));
    }

    static int fibo(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}