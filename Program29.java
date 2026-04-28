interface Bank {
    void deposit(double amt);
}

class Customer {
    String name = "Client1";
}

class Account extends Customer implements Bank {
    double balance = 0;

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Balance: " + balance);
    }
}

public class Program29 {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(5000);
    }
}