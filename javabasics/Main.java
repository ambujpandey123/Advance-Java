public class BankAccount {
private double balance;
public BankAccount(double initialBalance) {
    balance = initialBalance;
}
public void setBalance(double newBalance) {
    balance = newBalance;
}


public double getBalance() {
return balance;
}
}
public class Main {
public static void main(String[] args) {
BankAccount account = new BankAccount(100.0);
System.out.println("Current balance: " + account.getBalance());
account.setBalance(1500.0);
System.out.println("Updated balance: " + account.getBalance());
 
}
}