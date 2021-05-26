package day24_Loops;
import java.util.Scanner;
public class PinCodedoWhile {
    public static void main(String[]args){
        Scanner enter= new Scanner(System.in);
        System.out.println("Create your secret pin");
        int secretPin=enter.nextInt();
        int pincode;
        do {
            System.out.println("enter your pin ");
            pincode = enter.nextInt();

        }while (secretPin!=pincode);

    }
}
