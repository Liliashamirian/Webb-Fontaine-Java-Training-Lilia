package week1;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  12, Sep, 2020
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter A Number = ");
        if (Helper.isDataValid(scanner)) {
            int input = scanner.nextInt();
            if (input == 0) {
                System.out.println("Zero is Not Accepted");
            } else {
                for (int i = 1; i <= 9; i++) {
                    System.out.println(input + "*" + i + "=" + input * i);
                }
            }
        }
    }
}