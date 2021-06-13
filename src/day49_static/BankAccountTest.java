package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        System.out.println(MaBankAccount.balance);
        MaBankAccount bank = new MaBankAccount();
        bank.user="wood";
        bank.spend(50);
        bank.showBalance();

        MaBankAccount wife = new MaBankAccount();
        wife.user="wife";
        wife.showBalance();
    }
}
