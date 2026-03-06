import ExceptionHandlingDemo.Calculator;
import ExceptionHandlingDemo.DivisionException;

public class Demo {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        try {
            int result = c.divide(10, 0);
            System.out.println("Result: " + result);
        }

        catch (DivisionException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues without crashing.");
    }
}