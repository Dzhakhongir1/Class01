package IQJava.CreditCardInf;

public class Discover extends CreditCard{

    public Discover(long cardNumber, double balance) {
        super(cardNumber,balance);
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.apr = 11.99;
        this.cashBack = true;
    }

    @Override
    public void useCard() {
        System.out.println("Using Discover card");
    }

    @Override
    public void payBalance(double b) {
        System.out.println("Paying $"+balance+" from $"+this.balance);
        balance -= b;
    }
    @Override
    public String toString() {
        return "Chase credit card | " +
                "card number: " + cardNumber +
                " | balance used: " + balance +
                " | APR: " + apr +
                " | has cashback: " + cashBack;
    }
}
