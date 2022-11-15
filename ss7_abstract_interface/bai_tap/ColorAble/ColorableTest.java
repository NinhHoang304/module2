package ss7_abstract_interface.bai_tap.ColorAble;

import ss7_abstract_interface.bai_tap.Resizeable.*;



public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(5);
        shapes[2] = new Rectangle(2,3);
        shapes[3] = new Square(10);
        shapes[4] = new Square(20);

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
            if (shape instanceof Colorable) {
                Colorable colorable = (Colorable) shape;
                colorable.howToColor();
            }
        }
    }
}
