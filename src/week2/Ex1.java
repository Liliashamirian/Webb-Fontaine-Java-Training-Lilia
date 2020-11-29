package week2;

/**
 * Created by Lilia Shamirian on  14, Sep, 2020
 */
public class Ex1 {
    public static void main(String[] args) {
        int[] array = {8, 9, 5, 100, 78};
        System.out.println("The Reversed Array is: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}