package ss15_exception_debug.exersice;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh tam giác");
        do {
            try {
                System.out.println("Nhập cạnh thứ 1: ");
                int side1 = Integer.parseInt(sc.nextLine());
                checkInputNumber(side1);
                System.out.println("Nhập cạnh thứ 2: ");
                int side2 = Integer.parseInt(sc.nextLine());
                checkInputNumber(side2);
                System.out.println("Nhập cạnh thứ 3: ");
                int side3 = Integer.parseInt(sc.nextLine());
                checkInputNumber(side3);
                checkSumOfSide(side1, side2, side3);
                System.out.println("3 cạnh tam giác là " + side1 + " " + side2 + " " + side3);
                break;
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                System.err.println("Nhập sai kiểu dữ liệu");
            }
        } while (true);
    }

    public static void checkInputNumber(int number) throws IllegalTriangleException {
        if (number < 0) {
            throw new IllegalTriangleException("Không nhập cạnh tam giác là số âm, vui lòng nhập lại!");
        }
    }

    public static void checkSumOfSide(int side1, int side2, int side3) throws IllegalTriangleException {
        if ((side1 + side2) <= side3 || (side2 + side3) <= side1 || (side1 + side3) <= side2) {
            throw new IllegalTriangleException("Tổng 2 cạnh nhỏ hơn cạnh còn lại!");
        }
    }
}
