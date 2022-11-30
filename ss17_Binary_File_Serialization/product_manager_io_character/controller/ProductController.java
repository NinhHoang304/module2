package ss17_Binary_File_Serialization.product_manager_io_character.controller;

import ss17_Binary_File_Serialization.product_manager_io_character.model.Product;
import ss17_Binary_File_Serialization.product_manager_io_character.service.IProductService;
import ss17_Binary_File_Serialization.product_manager_io_character.service.Impl.ProductServiceImpl;

import java.io.IOException;
import java.util.List;

public class ProductController {

    private final IProductService productService = new ProductServiceImpl();

    public void addProduct(Product product) {
        try {
            this.productService.addProduct(product);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> getProducts() {
        try {
            return this.productService.getProducts();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Product> findProduct(int id) {
        try {
            return this.productService.findProduct(id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
