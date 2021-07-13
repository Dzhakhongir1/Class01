package IQJava.CreditCardInf;

public class CapitalOne extends CreditCard{


    public CapitalOne(long cardNumber, double balance) {
        super(cardNumber,balance );
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.apr = 14.35;
        this.cashBack = false;
    }

    @Override
    public void useCard() {
        System.out.println("Using Capital One card");
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
