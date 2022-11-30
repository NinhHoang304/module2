package ss17_Binary_File_Serialization.product_manager_io_character.view;

import ss17_Binary_File_Serialization.product_manager_io_character.controller.ProductController;
import ss17_Binary_File_Serialization.product_manager_io_character.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {

    private final ProductController productController = new ProductController();

    private final Scanner sc = new Scanner(System.in);

    public void displayMenuProduct() {
        do {
            System.out.println("--------Menu---------");
            System.out.println("1. Display product:");
            System.out.println("2. Add product:");
            System.out.println("3. Find product (id):");
            System.out.println("4. Exit");

            System.out.println("Enter your option");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    List<Product> products = this.productController.getProducts();
                    if (products == null) {
                        break;
                    }
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.println("Input code product: ");
                    int productCode = Integer.parseInt(sc.nextLine());

                    System.out.println("Input Name Product: ");
                    String productName = sc.nextLine();

                    System.out.println("Input Brand Product: ");
                    String productBrand = sc.nextLine();

                    System.out.println("Input Price Product: ");
                    double productPrice = Double.parseDouble(sc.nextLine());

                    System.out.println("Input description: ");
                    String productDescription = sc.nextLine();

                    Product product = new Product(productCode, productName, productBrand, productPrice, productDescription);
                    this.productController.addProduct(product);
                    break;
                case 3:
                    System.out.println("Input id to find product: ");
                    int findProductWithId = Integer.parseInt(sc.nextLine());

                    List<Product> products1 = this.productController.getProducts();
                    if (products1 == null) break;
                    for (Product p : products1) {
                        if (p.getCode() == findProductWithId) {
                            System.out.println(p);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Invalid option!");
            }
        } while (true);
    }
}
