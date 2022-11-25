package ss14_thuat_toan_sap_xep.exercise;

            import java.util.Arrays;
            import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        System.out.println("Enter " + array.length + " value: ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Your input list: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println("\nBegin sort processing...");
        insertionSortByStep(array);
    }

    public static void insertionSortByStep(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                System.out.println("Steps to change: " + Arrays.toString(array));
                pos--;
            }
            array[pos] = x;
            if (i != pos) {
                System.out.println("Array after inserting array[" + i + "] = array[" + (i - 1) + "] is: "
                        + Arrays.toString(array));
            }
        }

        System.out.println("Array after sorted: " + Arrays.toString(array));
    }
}


