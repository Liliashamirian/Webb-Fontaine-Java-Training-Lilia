package week1;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  11, Sep, 2020
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fahrenheit Temperature = ");
        if (Helper.isDataValid(scanner)) {
            float input = scanner.nextFloat();
            float result = (input - 32) * 5 / 9;
            System.out.println(input + " °F is = " + result + " °C ");
        }
    }
}