package ss17_Binary_File_Serialization.exersice.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int productCode;
    private String productName;
    private String productBrand;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int productCode, String productName, String productBrand, double price, String description) {
        this.productCode = productCode;
        this.productName = productName;
        this.productBrand = productBrand;
        this.price = price;
        this.description = description;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", productBrand='" + productBrand + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
