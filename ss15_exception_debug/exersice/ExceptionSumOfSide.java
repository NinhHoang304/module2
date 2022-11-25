package ss15_exception_debug.exersice;

public class ExceptionSumOfSide extends Exception{
    @Override
    public String getMessage() {
        String str = "Tổng 2 cạnh không được nhỏ hơn cạnh còn lại";
        return str;
    }
}
