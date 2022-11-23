package ss11_stack_queue.exercise.palindrome;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        String[] arrayStr = str.split(" ");

        Stack<String> stackChar = new Stack<>();
        Queue<String> queueChar = new ArrayDeque<>();

        for (String value: arrayStr) {
            stackChar.push(value);
            queueChar.add(value);
        }

        boolean flag = false;
        int size = arrayStr.length;
        for (int i = 0; i < size; i++) {
            if (stackChar.pop().equals(queueChar.remove())){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("This string is palindrome");
        }else {
            System.out.println("This string is not palindrome");
        }
    }
}
