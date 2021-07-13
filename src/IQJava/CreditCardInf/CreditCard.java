package IQJava.CreditCardInf;

public  class CreditCard {
    long cardNumber=0;
    double balance=0;
    double apr =0;
    boolean cashBack=false;

    public CreditCard(long cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void useCard(){}
     public void payBalance(double b){}
    @Override
    public String toString() {
        return "Chase credit card | " +
                "card number: " + cardNumber +
                " | balance used: " + balance +
                " | APR: " + apr +
                " | has cashback: " + cashBack;
    }

}
