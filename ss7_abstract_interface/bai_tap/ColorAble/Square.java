package ss7_abstract_interface.bai_tap.ColorAble;

public abstract class Square implements Colorable {
    public Square() {
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
