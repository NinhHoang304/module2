package giai_thuat_ca_nhan;

public class VietHinhThoiRongBangSo {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
