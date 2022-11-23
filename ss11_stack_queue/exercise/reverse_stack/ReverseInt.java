package ss11_stack_queue.exercise.reverse_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInt {
    public static void main(String[] args) {
        Stack<Integer> arrayList = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element integer of array: ");
            array[i] = Integer.parseInt(sc.nextLine());
            arrayList.push(array[i]);
        }
        System.out.println("Display element of array " + Arrays.toString(array));
        // dùng phương thức pop() để lấy giá trị bị xoá ở cuối mảng gán array -> đảo ngc
        for (int i = 0; i < size; i++) {
            array[i] = arrayList.pop();
        }

        System.out.println("Display element of array after reverse: " + Arrays.toString(array));
    }
}
