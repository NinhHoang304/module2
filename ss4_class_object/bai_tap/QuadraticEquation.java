package ss4_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (Math.pow(getB(), 2)) - (4 * getA() * getC());
    }

    public double getRoot1() {
        return (-getB() + Math.sqrt(getDiscriminant())) / (2 * getA());
    }

    public double getRoot2() {
        return (-getB() - Math.sqrt(getDiscriminant())) / (2 * getA());
    }

    public double getRoot() {
        return -getB() / (2 * getA());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số c: ");
        double c = Double.parseDouble(sc.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Root 1: " + quadraticEquation.getRoot1());
            System.out.println("Root 2: " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Root 1 = Root 2 = " + quadraticEquation.getRoot());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
