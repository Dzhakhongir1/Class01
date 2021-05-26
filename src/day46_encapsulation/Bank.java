package day46_encapsulation;

public class Bank {
    public static void main(String[] args) {
        CheckingAccount fnbo = new CheckingAccount();
        fnbo.setAccountHolder("Dzhakhongir islamov");
        fnbo.setAccountNumber(98545465);
        fnbo.setBalance(964056456);
        fnbo.setType("Checking");
        System.out.println(fnbo);
    }
}
