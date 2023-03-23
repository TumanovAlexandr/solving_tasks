package basepatterns.structural.facade;

public class FundsCheck {
    private double balance = 1000.0;

    public boolean haveEnoughMoney(double amount) {
        return balance >= amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
