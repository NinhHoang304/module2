package ss12_java_collection.exercise.service;

import ss12_java_collection.exercise.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    boolean editProduct(int id);

    boolean deleteProduct(int id);

    List<Product> getAll();
}
