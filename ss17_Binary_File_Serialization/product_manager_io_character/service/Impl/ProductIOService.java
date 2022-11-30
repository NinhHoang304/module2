package ss17_Binary_File_Serialization.product_manager_io_character.service.Impl;

import ss17_Binary_File_Serialization.product_manager_io_character.model.Product;
import ss17_Binary_File_Serialization.product_manager_io_character.service.IProductIOService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductIOService implements IProductIOService {
    @Override
    public List<Product> readFile(String pathFile, boolean checkFileNotFound) throws IOException {
        File file = new File(pathFile);

        if (!file.exists()) {
            if (checkFileNotFound) {
                throw new FileNotFoundException("Not found product file");
            }
            file.createNewFile();
        }

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Product> products = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] element = line.split(",");
            Product product = new Product(Integer.parseInt(element[0]), element[1], element[2], Double.parseDouble(element[3]), element[4]);
            products.add(product);
        }

        bufferedReader.close();
        fileReader.close();

        return products;
    }

    @Override
    public void writeFile(String pathFile, List<Product> products) throws IOException {
        File file = new File(pathFile);

        if (!file.exists()){
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for(Product p: products){
            bufferedWriter.write(p.formatCSVForProduct());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        fileWriter.close();
    }
}
