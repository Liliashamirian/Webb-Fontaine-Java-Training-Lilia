package week1;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  13, Sep, 2020
 */
public class Helper {
    public static boolean isDataValid(Scanner scanner) {
        if (!(scanner.hasNextInt()) || !(scanner.hasNextFloat()) || !(scanner.hasNextDouble())) {
            System.out.println("Please Enter A Valid Input");
            return false;
        }
        return true;
    }
}