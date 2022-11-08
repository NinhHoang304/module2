package ss3_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] arrayMatrix;
        System.out.println("Input row: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Input col: ");
        int col = Integer.parseInt(sc.nextLine());
        arrayMatrix = new double[row][col];
        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                System.out.println("Enter a element: ");
                arrayMatrix[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        System.out.print("Array: ");
        System.out.println(Arrays.deepToString(arrayMatrix));
        // sum diagonal line in array matrix
        int sum = 0;
        for (int i = 0; i < arrayMatrix.length; i++) {
            sum += arrayMatrix[i][i];
        }
        System.out.println("Sum is: " + sum);
    }
}
