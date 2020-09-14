package week1;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  12, Sep, 2020
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First number:");
        if (Helper.isDataValid(scanner)) {
            double firstNumber = scanner.nextDouble();
            System.out.println("Please Enter Second Number");
            if (Helper.isDataValid(scanner)) {
                double secondNumber = scanner.nextDouble();
                System.out.println("Please Enter Operator");
                char operator = scanner.next().charAt(0);
                switch (operator) {
                    case '+':
                        double result = firstNumber + secondNumber;
                        System.out.println(firstNumber + "+" + secondNumber + "=" + result);
                        break;

                    case '-':
                        double result2 = firstNumber - secondNumber;
                        System.out.println(firstNumber + "-" + secondNumber + "=" + result2);
                        break;

                    case '*':
                        double result3 = firstNumber * secondNumber;
                        System.out.println(firstNumber + "*" + secondNumber + "=" + result3);
                        break;

                    case '/':
                        if (secondNumber == 0) {
                            System.out.println("Can't Divide By Zero");
                        } else {
                            double result4 = firstNumber / secondNumber;
                            System.out.println(firstNumber + "/" + secondNumber + "=" + result4);
                            break;
                        }
                    default:
                        System.out.println("Please Enter Valid Operator");
                }
            }
        }
    }
}