package day08_casting__scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance =345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;
        double total = balance-price1-price2-price3;
        System.out.println(balance-price1-price2-price3);
        System.out.println("your total after your purchase is " +total+ " thank you for your purchase " );

        int balanceWithNoCents= (int)total;
        //if you want to assigng different value put it in before the total or whaever the name of the variable is
        //
        System.out.println("Your remaining balance without cents: $" +balanceWithNoCents );
        //
    }
}
