package ss11_stack_queue.exercise.reverse_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        String[] mWord = str.split(" ");
        for (String word: mWord) {
            wStack.push(word);
        }

        System.out.println("String: " + Arrays.toString(mWord));
        String newStr = "";
        int size = mWord.length;
        for (int i = 0; i < size; i++) {
            mWord[i] = wStack.pop();
            newStr += mWord[i] + " ";
        }

        System.out.println("String after reverse: " + newStr);
    }
}
