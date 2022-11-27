package ss12_java_collection.exercise.service.impl;

import ss12_java_collection.exercise.model.Product;
import ss12_java_collection.exercise.service.IProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        for (Product value: this.productList) {
            // loại bỏ trường hợp trùng lặp sản phẩm
            if (value.getId() == product.getId()){
                return;
            }
        }
        // khi sản phẩm truyền vào ko trùng thì sẽ được thêm vào list product
        this.productList.add(product);
    }

    @Override
    public boolean editProduct(int id) {
        return false;
    }

    @Override
    public boolean deleteProduct(int id) {
        return false;
    }

    @Override
    public List<Product> getAll() {
        return this.productList;
    }
}
