package week3;

/**
 * Created by Lilia Shamirian on  26, Sep, 2020
 */
public class Ex3 {
    public static void main(String[] args) {

        double a = 1;
        double b = 1;
        double c = 10;
        if (isItATriangle(a, b, c)) {
            System.out.println("It is A Triangle");
            System.out.println("The Area Is :  = " + calculateArea(a, b, c));
        }
    }

    private static boolean isItATriangle(double a, double b, double c) {
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println(" It's Not a Triangle :( ");
            return false;
        }
        return true;
    }

    private static double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}