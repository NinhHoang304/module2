package ss17_Binary_File_Serialization.exersice.view;

import ss17_Binary_File_Serialization.exersice.controller.ProductController;
import ss17_Binary_File_Serialization.exersice.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final Scanner sc = new Scanner(System.in);
    private final ProductController productController = new ProductController();

    public void displayProductMenu() {
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Display all\n" +
                    "2. Add new product\n" +
                    "3. Search product\n" +
                    "4. Exit\n");
            System.out.print("Select your choice: ");
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    List<Product> productList = this.productController.getAll();
                    //Hien thi
                    
            }
        }
    }
}
