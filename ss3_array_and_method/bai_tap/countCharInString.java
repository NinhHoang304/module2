package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class countCharInString {
    public static void main(String[] args) {
        String str = "codegympro";
        char character = 'o';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character){
                count++;
            }
        }
        System.out.println("Trong chuỗi có 2 ký tự " + character + " xuất hiện " + count + " lần.");
    }
}
