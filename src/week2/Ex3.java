package week2;

/**
 * Created by Lilia Shamirian on  15, Sep, 2020
 */
public class Ex3 {
    public static void main(String[] args) {
        int[] array1 = {3, 2, 5, 8, 7, 6, 4};
        int[] array2 = {3, 2, 8, 7, 6};
        int j;
        for (int i = 0; i < array1.length; i++) {
            for (j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    break;
            }
            if (j == array2.length)
                System.out.print(array1[i] + " ");
        }
    }
}