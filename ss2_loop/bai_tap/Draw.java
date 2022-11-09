package ss2_loop.bai_tap;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        System.out.println("Menu vẽ hình: 1. Hình chữ nhật, 2. Hình tam giác vuông, 3. Hình tam giác vuông ngược, 4. Thoát");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số của hình bạn muốn vẽ: ");
        int number = Integer.parseInt(sc.nextLine());
        switch (number) {
            case 1:
                // hinh chu nhat
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                // tam giac vuong
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                // tam giac vuong nguoc
                System.out.println("");
                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            default:
                System.out.println("Thoát");
                break;
        }
    }
}
