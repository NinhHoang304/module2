package ss3_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        int size = array.length;
        System.out.print("Mảng cho sẵn: ");
        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào 1 phần tử muốn chèn vào mảng: ");
        int element = Integer.parseInt(sc.nextLine());
        int index;
        do {
            System.out.print("Nhập vào vị trí cần chèn: ");
            index = Integer.parseInt(sc.nextLine());
            if (index <= -1 || index >= size - 1) {
                System.out.println("Không chèn được phần tử vào mảng, vui lòng nhập index >= 0 và < 10");
            }
        } while (index <= -1 || index >= size - 1);

        for (int i = 0; i < size; i++) {
            if (i == index) {
                for (int j = size - 1; j > i; j--) {
                    array[j] = array[j - 1];
                }
                array[index] = element;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
