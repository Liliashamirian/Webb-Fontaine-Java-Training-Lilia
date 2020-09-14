package week1;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  12, Sep, 2020
 */
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Floating Number: ");
        if (Helper.isDataValid(scanner)) {
            float number = scanner.nextFloat();
            if (number == 0) {
                System.out.println("Zero");
            } else if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            } else if (Math.abs(number) < 1) {
                System.out.println("Small");
            } else if (Math.abs(number) > 1000000) {
                System.out.println("Large");
            }
        }
    }
}