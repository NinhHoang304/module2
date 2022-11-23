package ss11_stack_queue.exercise.convert;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> binaryList = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (number != 0){
            binaryList.push(number % 2);
            number /= 2;
        }

        System.out.print("Binary is: " + "0");
        while (!(binaryList.isEmpty())){
            System.out.print(binaryList.pop());
        }
    }
}
