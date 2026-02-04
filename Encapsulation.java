class BankAccount {
    private int balance = 1000;

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        acc.deposit(500);

        System.out.println(acc.getBalance());
    }
}
