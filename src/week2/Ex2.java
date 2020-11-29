package week2;

/**
 * Created by Lilia Shamirian on  15, Sep, 2020
 */
public class Ex2 {
    public static void main(String[] args) {
        double sum = 0;
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 10;
            String strDouble = String.format("%.2f", array[i]);
            System.out.print(strDouble + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double avg = sum / array.length;
        System.out.println();
        System.out.print("The Arithmetic Mean is: ");
        String strDouble = String.format("%.2f", avg);
        System.out.print(strDouble);
    }
}