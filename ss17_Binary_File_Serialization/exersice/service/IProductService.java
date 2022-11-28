package ss17_Binary_File_Serialization.exersice.service;

import ss17_Binary_File_Serialization.exersice.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    List<Product> getAll();

    boolean findProduct(int id);
}
