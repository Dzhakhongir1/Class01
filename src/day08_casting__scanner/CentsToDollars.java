package day08_casting__scanner;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        int dollars = cents/100;
        int remainingCents = cents%100;
        System.out.println(remainingCents);
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);
        System.out.println("In "+cents+" cents: "+ dollars+" dollars "+remainingCents);
    }
}
