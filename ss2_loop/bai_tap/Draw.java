package ss2_loop.bai_tap;

public class Draw {
    public static void main(String[] args) {
        // hinh chu nhat
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

        // tam giac vuong
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

        // tam giac vuong nguoc
        System.out.println("");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
