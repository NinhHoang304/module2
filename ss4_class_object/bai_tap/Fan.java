package ss4_class_object.bai_tap;

public class Fan {
    final int Slow = 1;
    final int Medium = 2;
    final int Fast = 3;
    private int speed = Slow;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Fan is on with speed: " + speed + ", radius: " + radius + ", color: " + color;
        } else {
            return "Fan is off, color: " + color + ", radius: " + radius;
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10.0, "yellow");
        Fan fan2 = new Fan(5, false, 5.0, "blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
