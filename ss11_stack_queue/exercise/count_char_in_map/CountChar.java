package ss11_stack_queue.exercise.count_char_in_map;

import java.util.Scanner;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args) {
        TreeMap<String, Integer> words = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        String[] arrayWord = str.toUpperCase().split(" ");
        int count;
        for (String value : arrayWord) {
            count = 0;
            for (String s : arrayWord) {
                if (value.equals(s)) {
                    count++;
                }
            }
            words.put(value, count);
        }
        System.out.println(words);
    }
}
