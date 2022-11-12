package ss6_extend.bai_tap.CircleCylinder;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = Double.parseDouble(cs.nextLine());
        System.out.println("Enter a color: ");
        String color = cs.nextLine();

        Circle circle = new Circle(radius, color);
        System.out.println(circle);
    }
}
