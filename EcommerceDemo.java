import Ecommerce.Customer;
import Ecommerce.Order;
import Ecommerce.Product;

public class EcommerceDemo {
    public static void main(String[] args) {

        Product p = new Product(101, "Laptop", 50000);
        Customer c = new Customer(1, "Rahul");

        System.out.println("Customer Details:");
        c.displayCustomer();

        Order o = new Order(p, 2);
        o.placeOrder();
    }
}