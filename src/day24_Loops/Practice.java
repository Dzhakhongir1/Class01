package day24_Loops;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ExpectedPin = 5896;
        System.out.println("enter your pin");
        int pin = scan.nextInt();
        do {
            if (pin == ExpectedPin) {
                System.out.println("Welcome");

            } else {
                System.out.println("Wrong pin try again");
            }
        }while(pin!=ExpectedPin);


    }
}
