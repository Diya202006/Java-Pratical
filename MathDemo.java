import MathOperations.CeilOperation;
import MathOperations.FloorOperation;
import MathOperations.RoundOperation;

public class MathDemo {

    public static void main(String[] args) {

        double num = 12.67;

        FloorOperation f = new FloorOperation();
        CeilOperation c = new CeilOperation();
        RoundOperation r = new RoundOperation();

        System.out.println("Number: " + num);

        f.findFloor(num);
        c.findCeil(num);
        r.findRound(num);
    }
}