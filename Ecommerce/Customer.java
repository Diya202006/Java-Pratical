package Ecommerce;

public class Customer {
    int customerId;
    String customerName;

    public Customer(int id, String name) {
        customerId = id;
        customerName = name;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
    }
}