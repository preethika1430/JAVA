import java.util.*;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

class Account {
    String accountNumber;
    String holderName;
    double balance;

    public Account(String accNo, String name, double bal) {
        accountNumber = accNo;
        holderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited into " + accountNumber);
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance!");
        }
        balance -= amount;
        System.out.println(amount + " withdrawn from " + accountNumber);
    }

    void transfer(Account target, double amount) throws InsufficientFundsException {
        if (target == null) {
            System.out.println("Invalid target account!");
            return;
        }
        withdraw(amount);
        target.deposit(amount);
        System.out.println("Transferred " + amount + " to " + target.accountNumber);
    }

    void displayAccountDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------");
    }
}

class Bank {
    Map<String, Account> accounts = new HashMap<>();

    void createAccount(String accNo, String name, double bal) {
        accounts.put(accNo, new Account(accNo, name, bal));
        System.out.println("Account created: " + accNo);
    }

    Account getAccount(String accNo) {
        return accounts.get(accNo);
    }

    void displayAllAccounts() {
        for (Account acc : accounts.values()) {
            acc.displayAccountDetails();
        }
    }
}

public class Main3 {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.createAccount("101", "Amit", 5000);
        bank.createAccount("102", "Neha", 3000);

        Account a1 = bank.getAccount("101");
        Account a2 = bank.getAccount("102");

        try {
            a1.deposit(2000);
            a1.withdraw(1000);
            a1.transfer(a2, 2500);

            a2.withdraw(10000);  // This will throw exception

        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nAll Accounts:");
        bank.displayAllAccounts();
    }
}

