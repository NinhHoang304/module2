package ss17_Binary_File_Serialization.product_manager_io_binary_file.exception;

public class ExistProductException extends Exception{
    public ExistProductException() {
        super("Product is available");
    }
}
