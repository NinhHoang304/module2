package ss6_extend.bai_tap.CircleCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "Radius= " + super.getRadius() +
                " ,Color= " + super.getColor() +
                " ,volume= " + getVolume() +
                " ,height=" + height +
                '}';
    }
}
