package ss7_abstract_interface.thuc_hanh.comparable;

public class Circle {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * (this.radius * 2);
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.getRadius();
    }
}
