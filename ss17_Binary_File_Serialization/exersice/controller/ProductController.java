package ss17_Binary_File_Serialization.exersice.controller;

import ss17_Binary_File_Serialization.exersice.model.Product;
import ss17_Binary_File_Serialization.exersice.service.IProductService;
import ss17_Binary_File_Serialization.exersice.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductServiceImpl();

    public void add(Product product){
        this.productService.addProduct(product);
    }

    public List<Product> getAll() {
        return this.productService.getAll();
    }

}
