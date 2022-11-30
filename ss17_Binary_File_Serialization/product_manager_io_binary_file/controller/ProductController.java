package ss17_Binary_File_Serialization.product_manager_io_binary_file.controller;

import ss17_Binary_File_Serialization.product_manager_io_binary_file.exception.ExistProductException;
import ss17_Binary_File_Serialization.product_manager_io_binary_file.model.Product;
import ss17_Binary_File_Serialization.product_manager_io_binary_file.service.IProductService;
import ss17_Binary_File_Serialization.product_manager_io_binary_file.service.Impl.ProductServiceImpl;

import java.io.IOException;
import java.util.List;

public class ProductController {

    IProductService productService = new ProductServiceImpl();

    public void addProduct(Product product) {
        try {
            this.productService.add(product);
        } catch (IOException | ClassNotFoundException | ExistProductException e) {
            e.printStackTrace();
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public List<Product> displayProduct(){
        try {
            return this.productService.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void findProduct(int id) {
        try {
            this.productService.find(id);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
