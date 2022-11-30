package ss17_Binary_File_Serialization.product_manager_io_character.service.Impl;

import ss17_Binary_File_Serialization.product_manager_io_character.model.Product;
import ss17_Binary_File_Serialization.product_manager_io_character.service.IProductService;

import java.io.IOException;
import java.util.List;

public class ProductServiceImpl implements IProductService {

    private final String PATH_FILE = "src/ss17_Binary_File_Serialization/product_manager_io_character/data/product_file";

    private final ProductIOService productIOService = new ProductIOService();

    @Override
    public void addProduct(Product product) throws IOException {
        List<Product> products = this.productIOService.readFile(PATH_FILE, false);
        for (Product p : products) {
            if (p.getCode() == product.getCode()) {
                System.out.println("Loi");
            }
        }
        products.add(product);
        this.productIOService.writeFile(PATH_FILE, products);
    }

    @Override
    public List<Product> getProducts() throws IOException {
        return this.productIOService.readFile(PATH_FILE, true);
    }

    @Override
    public List<Product> findProduct(int id) throws IOException {
        return this.productIOService.readFile(PATH_FILE, true);
    }
}
