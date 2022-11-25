package ss15_exception_debug.exersice;

public class ExceptionNegativeNumber extends Exception{
    @Override
    public String getMessage() {
        String str = "Không được nhập cạnh là số âm, vui lòng nhập lại!";
        return str;
    }
}
