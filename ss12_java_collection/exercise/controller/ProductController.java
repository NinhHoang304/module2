package ss12_java_collection.exercise.controller;

import ss12_java_collection.exercise.model.Product;
import ss12_java_collection.exercise.service.IProductService;
import ss12_java_collection.exercise.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductServiceImpl();

    public void addProduct(Product product) {
        this.productService.addProduct(product);
    }

    public boolean editProduct(int id) {
        return this.productService.editProduct(id);
    }

    public boolean deleteProduct(int id) {
        return this.productService.deleteProduct(id);
    }

    public List<Product> getAll() {
        return this.productService.getAll();
    }
}
