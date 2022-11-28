package ss17_Binary_File_Serialization.exersice.service.impl;

import ss17_Binary_File_Serialization.exersice.model.Product;
import ss17_Binary_File_Serialization.exersice.service.IProductService;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService {
    public final List<Product> productList = new ArrayList<>();
    public final String PATH_FILE = "src/ss17_Binary_File_Serialization/exersice/data/outputProductFile.csv";

    @Override
    public void addProduct(Product product) {
        for (Product value : productList) {
            if (value.getProductCode() == product.getProductCode()) {
                return;
            }
        }
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH_FILE);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(product);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public List<Product> getAll() {
        return this.productList;
    }

    @Override
    public boolean findProduct(int id) {
        return false;
    }
}
