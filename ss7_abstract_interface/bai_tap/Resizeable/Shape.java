package ss7_abstract_interface.bai_tap.Resizeable;

public abstract class Shape {
    private String color;
    private String filled;

    protected Shape() {
    }

    protected Shape(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public String isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }
}