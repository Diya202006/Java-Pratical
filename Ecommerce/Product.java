package Ecommerce;

public class Product {
    int productId;
    String name;
    double price;

    public Product(int id, String n, double p) {
        productId = id;
        name = n;
        price = p;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }

    public double getPrice() {
        return price;
    }
}