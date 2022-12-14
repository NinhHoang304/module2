package ss7_abstract_interface.thuc_hanh.comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else {
            return 1;
        }
    }
}
