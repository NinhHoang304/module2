package ss13_thuat_toan_tim_kiem.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int sizeOfArray = Integer.parseInt(sc.nextLine());

        int[] array = new int[sizeOfArray];
        System.out.println("Enter element of array: ");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Element of array after sort: " + Arrays.toString(array));

        System.out.println("Enter value to find: ");
        int valueToFind = Integer.parseInt(sc.nextLine());

        System.out.println(binarySearch(array, 0, sizeOfArray - 1, valueToFind));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] < value) {
                return binarySearch(array, middle + 1, right, value);
            } else {
                return binarySearch(array, left, middle - 1, value);
            }
        } else {
            return -1;
        }
    }
}
