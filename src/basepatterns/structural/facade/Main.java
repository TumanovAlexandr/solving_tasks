package basepatterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade(12345678, 1234);
        bankFacade.withdraw(1000);
    }
}
