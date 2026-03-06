 class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}
 
class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}
 
class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit negative amount!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw negative amount!");
        }
        if (amount > balance) {
            throw new LowBalanceException("Withdrawal amount exceeds balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}
 
public class DemoOfbank {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(5000);

        try {
            acc.balanceEnquiry();

            acc.deposit(2000);
            acc.withdraw(3000);

            acc.withdraw(6000);  
            acc.deposit(-100);   

        } catch (LowBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        acc.balanceEnquiry();
    }
}