package week1;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  13, Sep, 2020
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        if (Helper.isDataValid(scanner)) {
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("Zero");
            } else if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
            System.out.println("Bye");
        }
    }
}