package ss5_access_modifier_static_method_property.bai_tap.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0, "Yellow");
        System.out.println(circle);
        System.out.println("Radius is " + circle.getRadius());
        System.out.println("Area is " + circle.getArea());
    }
}
