package ss17_Binary_File_Serialization.product_manager_io_character.service;

import ss17_Binary_File_Serialization.product_manager_io_character.model.Product;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    void addProduct(Product product) throws IOException;
    List<Product> getProducts() throws IOException;
    List<Product> findProduct(int id) throws IOException;
}
