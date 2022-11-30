package ss17_Binary_File_Serialization.product_manager_io_binary_file.view;

import ss17_Binary_File_Serialization.product_manager_io_binary_file.controller.ProductController;
import ss17_Binary_File_Serialization.product_manager_io_binary_file.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {

    private final ProductController productController = new ProductController();

    private final Scanner sc = new Scanner(System.in);

    public void displayMenuProduct() {
        do {
            System.out.println("------Menu------");
            System.out.println("1. Display all product");
            System.out.println("2. Add product");
            System.out.println("3. Find product");
            System.out.println("4. Exit");

            System.out.println("Choice your option:");
            int option = Integer.parseInt(sc.nextLine());

            switch (option){
                case 1:
                    List<Product> products = this.productController.displayProduct();
                    if (products == null)break;
                    for (Product p: products){
                        System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.println("Input product id:");
                    int productId = Integer.parseInt(sc.nextLine());

                    System.out.println("Input product name:");
                    String productName = sc.nextLine();

                    System.out.println("Input product brand:");
                    String productBrand = sc.nextLine();

                    System.out.println("Input product price:");
                    double productPrice = Double.parseDouble(sc.nextLine());

                    System.out.println("Input description:");
                    String description = sc.nextLine();

                    Product product = new Product(productId, productName, productBrand, productPrice, description);
                    this.productController.addProduct(product);
                    break;
                case 3:
                    System.out.println("Input id to find product: ");
                    int idToFind = Integer.parseInt(sc.nextLine());

                    this.productController.findProduct(idToFind);
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Invalid option!");
            }
        }while (true);
    }
}
