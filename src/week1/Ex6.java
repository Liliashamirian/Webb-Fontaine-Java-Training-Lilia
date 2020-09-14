package week1;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  13, Sep, 2020
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Coordinates: ");
        System.out.println("X1:");
        double x1 = scanner.nextDouble();
        System.out.println("Y1:");
        double y1 = scanner.nextDouble();
        System.out.println("X2:");
        double x2 = scanner.nextDouble();
        System.out.println("Y2:");
        double y2 = scanner.nextDouble();
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);

        System.out.println("Distance between 2 cities is " + a);

        double b = ((y1 - x1) / 2);
        double c = ((y2 - x2) / 2);

        System.out.println("Middle point between 2 cities is " + "(" + b + ", " + c + ")");
    }
}