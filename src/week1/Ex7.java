package week1;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  12, Sep, 2020
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First number:");
        if (Helper.isDataValid(scanner)) {
            int firstNumber = scanner.nextInt();
            System.out.println("Please Enter Second Number");
            if (Helper.isDataValid(scanner)) {
                int secondNumber = scanner.nextInt();
                System.out.println("Please Enter Third Number");
                if (Helper.isDataValid(scanner)) {
                    int thirdNumber = scanner.nextInt();
                    if (firstNumber > secondNumber && firstNumber > thirdNumber) {
                        System.out.println("Greatest number is " + firstNumber);
                    } else System.out.println("Greatest number is " + Math.max(secondNumber, thirdNumber));
                }
            }
        }
    }
}