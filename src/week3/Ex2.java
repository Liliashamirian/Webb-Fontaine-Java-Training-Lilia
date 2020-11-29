package week3;

/**
 * Created by Lilia Shamirian on  26, Sep, 2020
 */
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("The Sum Is : " + sum(2.2, 4.4));

    }

    private static int sum(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    private static double sum(double... numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    private static float sum(float... numbers) {
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}