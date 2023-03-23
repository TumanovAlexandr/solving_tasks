package basepatterns.structural.facade;

public class BankFacade {
    private AccountNumberCheck accountNumberCheck;
    private SecurityCodeCheck securityCodeCheck;
    private FundsCheck fundsCheck;

    public BankFacade(int accountNumber, int securityCode) {
        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();

        accountNumberCheck.setAccountNumber(accountNumber);
        securityCodeCheck.setSecurityCode(securityCode);
    }

    public void withdraw(double amount) {
        if (accountNumberCheck.accountActive() && securityCodeCheck.isCodeCorrect() && fundsCheck.haveEnoughMoney(amount)) {
            fundsCheck.withdraw(amount);
            System.out.println("Transaction complete.");
        } else {
            System.out.println("Transaction failed.");
        }
    }
}
