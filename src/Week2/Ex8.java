package Week2;

/**
 * Created by Lilia Shamirian on  22, Sep, 2020
 */
public class Ex8 {
    public static void main(String[] args) {
        int[] array1 = {7, 8, 6, 5, 2, 21, 3};
        int[] array2 = {10, 5, 9, 20, 7, 8, 21, 2};
        int[] array3 = new int[7];
        int x = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    array3[x] = array1[i];
                    System.out.print("[ " + array3[x] + " ]");
                    x++;
                }
            }
        }
    }
}