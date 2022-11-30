package ss17_Binary_File_Serialization.product_manager_io_binary_file.service.Impl;

import ss17_Binary_File_Serialization.product_manager_io_binary_file.model.Product;
import ss17_Binary_File_Serialization.product_manager_io_binary_file.service.IFileService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductIOProduct implements IFileService<Product> {

    @Override
    public List<Product> readFileBinary(String path) throws ClassNotFoundException {
        List<Product> products = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return products;
        } catch (IOException e) {
            //System.out.println("Error: " + e.getMessage());
            return products;
        }
    }

    @Override
    public void writeFileBinary(String path, List<Product> products) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(products);

        objectOutputStream.close();
        fileOutputStream.close();
    }
}
