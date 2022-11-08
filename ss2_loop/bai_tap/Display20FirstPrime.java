package ss2_loop.bai_tap;

import java.util.Scanner;

public class Display20FirstPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng số nguyên cần in ra > 20: ");
        int number = Integer.parseInt(sc.nextLine());

        boolean flag = true;
        int count = 0;

        for (int i = 2; i < 1000; i++) {
            if (count < number){
                for (int j = 2; j < Math.sqrt(i); j++) {
                    if (i %j == 0){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    System.out.print(i + " ");
                    count++;
                }
                flag = true;
            }else {
                break;
            }
        }
    }
}
