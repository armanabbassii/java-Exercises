//🔹 Exercise 2:
//Design a class called BankAccount with the following private attributes: ownerName,
//balance.
//• Add public methods: deposit(amount) and withdraw(amount) that modify the balance.
//• Add a getBalance() method to return the current balance.
//• In the main method, create a few bank accounts and simulate some deposits and
//withdrawals.

package CW4.Week4.q2;

public class BankAccount {
    private String ownerName;
    private int balance;


    //constructor
    public BankAccount(String ownerName, int balance) {
        this.balance = balance;
        this.ownerName = ownerName;
    }

    // int meghdarie ke mikhad bargardune.
    public void deposit(double amount) {
        if (amount > 0) {

            balance += amount;
        } else {
            System.out.println("amount is not enought");
        }
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {

            System.out.println("amount is not enought");
        }
        return balance;
    }

    // //////////////////////////////
    public String getOwnerName() {
        return getOwnerName();
    }

    public void setOwnerName() {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
