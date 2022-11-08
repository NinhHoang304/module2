package ss3_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementOfArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        // lấy size cho mảng
        do {
            System.out.println("Nhập vào kích thước mảng: ");
            size = Integer.parseInt(sc.nextLine());
            if (size <= 0) {
                System.out.println("Vui lòng nhập kích thước mảng lớn hơn 0");
            }
        } while (size <= 0);
        // nhập phần tử vào mảng
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " của mảng: ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập vào phần tử muốn xoá: ");
        int element = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        // xoá phần tử trong mảng theo element
        int widthArray = array.length - 1;
        for (int i = 0; i <= widthArray; i++) {
            if (array[i] == element) {
                for (int j = i; j < widthArray; j++) {
                    array[j] = array[j + 1];
                }
                array[widthArray] = 0;
                flag = true;
            }
        }

        if (flag){
            System.out.println(Arrays.toString(array));
        }else {
            System.out.println("Phần tử muốn xoá ko có trong mảng");
        }
    }
}
