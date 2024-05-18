class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Successfully deposited " + amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
        System.out.println("Successfully withdrew " + amount);
    }

    public void checkBalance() {
        System.out.println("Your balance is " + account.checkBalance());
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        ATM atm = new ATM(account);

        atm.deposit(500.0);
        atm.checkBalance();
        atm.withdraw(200.0);
        atm.checkBalance();
    }
}
