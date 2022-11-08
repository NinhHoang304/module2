package ss3_array_and_method.bai_tap;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int size1 = array1.length;
        int[] array2 = new int[5];
        int size2 = array2.length;

        for (int i = 0; i < size1; i++) {
            array1[i] = i;
        }
        System.out.print("Mảng 1: ");
        System.out.println(Arrays.toString(array1));

        for (int i = 0; i < size2; i++) {
            array2[i] = i + 5;
        }
        System.out.print("Mảng 2: ");
        System.out.println(Arrays.toString(array2));

        int size3 = size1 + size2;
        int[] array3 = new int[size3];
        System.arraycopy(array1, 0, array3, 0, size1);
        System.arraycopy(array2, 0, array3, size1, size2);
        System.out.print("Mảng 3: ");
        System.out.println(Arrays.toString(array3));
    }
}
