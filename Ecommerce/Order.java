package Ecommerce;

public class Order {
    Product product;
    int quantity;

    public Order(Product p, int q) {
        product = p;
        quantity = q;
    }

    public double calculateTotalCost() {
        return product.getPrice() * quantity;
    }

    public void placeOrder() {
        System.out.println("Order Placed Successfully");
        product.displayProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}