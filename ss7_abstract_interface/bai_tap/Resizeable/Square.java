package ss7_abstract_interface.bai_tap.Resizeable;

import ss7_abstract_interface.bai_tap.ColorAble.Colorable;

public class Square extends Shape implements Resizeable, Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, String filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public void resize(double percent) {
        this.side = this.side * Math.sqrt(percent / 100 + 1);
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}