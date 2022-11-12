package ss6_extend.bai_tap.Point2dPoint3d.Point2d;

import java.util.Arrays;

public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2d() {

    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    public void SetXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2d{" + "x=" + x + ", y=" + y + " Array= " + Arrays.toString(getXY()) + '}';
    }
}
