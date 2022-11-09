package ss2_loop.bai_tap;

import java.util.Scanner;

public class Display20FirstPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng số nguyên cần in ra: ");
        int number = Integer.parseInt(sc.nextLine());
        int count = 0;
        int N = 2;

        while (count < number) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.print(N + ", ");
            }
            N++;
        }
    }
}
