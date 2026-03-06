class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Minimum balance of 100 must be maintained.");
        } else {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(500);

        sa.deposit(200);
        sa.withdraw(300);
        sa.withdraw(350);  
    }
}