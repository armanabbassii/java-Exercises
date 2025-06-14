//🔹 Exercise 2:
//Design a class called BankAccount with the following private attributes: ownerName,
//balance.
//• Add public methods: deposit(amount) and withdraw(amount) that modify the balance.
//• Add a getBalance() method to return the current balance.
//• In the main method, create a few bank accounts and simulate some deposits and
//withdrawals.

package CW4.Week4.q2;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Arman", 700);

        bankAccount.deposit(200);
        bankAccount.withdraw(100);
        System.out.println(bankAccount.getBalance());

        // ////////////////////////

    }
}
