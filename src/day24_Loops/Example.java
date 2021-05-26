package day24_Loops;
import java.util.Random;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       Random randomnum= new Random();
        int secretNumber = randomnum.nextInt(101);
        int guessingNumber;
        do {
            System.out.println("Guess the secret number");
            guessingNumber=scan.nextInt();
            if(guessingNumber>secretNumber){
                System.out.println("wrong, you number is too large");
            }else if(guessingNumber<secretNumber){
                System.out.println("wrong your number is too small");
            }
        }while(secretNumber!=guessingNumber);
        System.out.println("congrats you found your secret number");
    }
}
