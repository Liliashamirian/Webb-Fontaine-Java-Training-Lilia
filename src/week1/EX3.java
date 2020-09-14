package week1;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  12, Sep, 2020
 */
public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your weight = ");
        if (Helper.isDataValid(scanner)) {
            float input = scanner.nextFloat();
            float result = input * 0.17f;
            if (input == 0) {
                System.out.println("You're Weight Cannot be Zero");
            } else {
                System.out.println("You're Weight on Moon will be :" + result);
            }
        }
    }
}
