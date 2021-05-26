package day13_conditional_statments;
import java.util.Scanner;
public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPin;
        int inputPinc;
        System.out.println("put your pin real quick");
        secretPin = scan.nextInt();
        inputPinc= scan.nextInt();
        if (secretPin==inputPinc){
            System.out.println("welcome to your account");
            System.out.println("You can withdraw, chek balance,deposit");

        }else{
            System.out.println("Incorrect pin "+secretPin);
            System.out.println("please try again");
            System.out.println("call 911 i need help ");
        }
    }
}
