package ss17_Binary_File_Serialization.product_manager_io_character.service;

import ss17_Binary_File_Serialization.product_manager_io_character.model.Product;

import java.io.IOException;
import java.util.List;

public interface IProductIOService {

     List<Product> readFile(String pathFile, boolean checkFileNotFound) throws IOException;

     void writeFile(String pathFile, List<Product> products) throws IOException;
}
