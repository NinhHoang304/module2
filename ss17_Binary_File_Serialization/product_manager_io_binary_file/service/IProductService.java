package ss17_Binary_File_Serialization.product_manager_io_binary_file.service;

import ss17_Binary_File_Serialization.product_manager_io_binary_file.exception.ExistProductException;
import ss17_Binary_File_Serialization.product_manager_io_binary_file.model.Product;

import java.io.IOException;
import java.util.List;

public interface IProductService {

    void add(Product product) throws IOException, ClassNotFoundException, ExistProductException;

    List<Product> display() throws IOException, ClassNotFoundException;

    void find(int id) throws IOException, ClassNotFoundException;
}
