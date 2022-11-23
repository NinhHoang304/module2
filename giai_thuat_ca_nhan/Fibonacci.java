package giai_thuat_ca_nhan;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Nhap n: ");
            number = Integer.parseInt(sc.nextLine());
            if (number < 0 || number > 20) {
                System.out.println("Nhap lai n: ");
                number = Integer.parseInt(sc.nextLine());
            }
        } while (number < 0 || number > 20);

        System.out.println(fibonacci(number));
    }

    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
}
