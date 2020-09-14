package week1;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  11, Sep, 2020
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number in Inches = ");
        if (Helper.isDataValid(scanner)) {
            float input = scanner.nextFloat();
            float result = input / 39.37f;
            System.out.println(input + " Inch is = " + result + " Meters ");
        }
    }
}