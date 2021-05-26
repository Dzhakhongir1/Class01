package day24_Loops;
import java.util.Scanner;
public class WhileLoopapples {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("how many apples you can eat at the time ");
        int apples =scan.nextInt();
        while (apples<=10){
            System.out.println("eating an apple "+ apples++);
        }
        System.out.println("no more apples:(");





    }
}
