package basepatterns.structural.facade;

public class AccountNumberCheck {
    private int accountNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive() {
        if (getAccountNumber() == 12345678) {
            return true;
        } else {
            return false;
        }
    }
}
