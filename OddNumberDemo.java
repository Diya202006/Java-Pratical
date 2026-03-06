 class OddNumberException extends Exception {
    OddNumberException(String msg) {
        super(msg);
    }
}

class NumberCheck {
 
    static void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd!");
        } else {
            System.out.println("Number is even.");
        }
    }
}

public class OddNumberDemo {
    public static void main(String[] args) {

        int num = 7;

        try {
            NumberCheck.checkNumber(num);
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}