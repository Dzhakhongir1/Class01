package day60_exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter a number ");
            int num = scan.nextInt();
            System.out.println("You entered = " + num);
            System.out.println(num/0);
        }catch (Exception e){
            System.out.println("Wrong input ");
        }finally {
            scan.close();
            System.out.println("Finnaly block will always run");
        }

    }
}
