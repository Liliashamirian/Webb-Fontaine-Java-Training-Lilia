package week2;

import java.util.Scanner;

/**
 * Created by Lilia Shamirian on  22, Sep, 2020
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill the array");
        int n = 2;
        int m = 3;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("numbers [ " + i + " ]" + " [ " + j + " ]" + "= ");
                array[i][j] = sc.nextInt();
            }
        }
        int[] singleArray = new int[2 * 3];
        for (int i = 0; i < n; i++) {

            for (int j = 0, y = 0; j < m; j++, y++) {
                singleArray[y] = array[i][j];
                System.out.print("[ " + singleArray[y] + " ]");
            }
        }
    }
}