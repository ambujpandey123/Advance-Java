public class Bank {
    double amount;

    Bank(double amount) {
        this.amount = amount;
    }

    void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
        System.out.println(message);
    }

    void deposit(double depositAmount) {
        amount += depositAmount;
    }

    void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        Bank account = new Bank(10000);
        account.withdraw(5000);
        account.deposit(5000);
        account.displayBalance();
    }
}