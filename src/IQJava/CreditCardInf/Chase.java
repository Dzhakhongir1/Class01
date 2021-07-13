package IQJava.CreditCardInf;

public class Chase extends CreditCard{
    public Chase(long cardNumber, double balance) {
        super(cardNumber, balance);
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.apr = 10.99;
        this.cashBack = true;

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
