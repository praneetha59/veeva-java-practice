interface Account {
    double MIN_BALANCE = 500;   // public static final by default
    void deposit(double amount);
}

interface SavingsAccount extends Account {
    void addInterest();
}

class MySavings implements SavingsAccount {
    double balance = MIN_BALANCE;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Balance: " + balance);
    }

    public void addInterest() {
        balance += balance * 0.04;
        System.out.println("After interest: " + balance);
    }
}

public class BankInterfaceDemo {
    public static void main(String[] args) {
        MySavings acc = new MySavings();
        acc.deposit(1000);
        acc.addInterest();
    }
}
