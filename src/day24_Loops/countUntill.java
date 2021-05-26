package day24_Loops;
import java.util.Scanner;
public class countUntill {
    public static void main(String[] args) throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter your number to stop");
        int numberToStop = keyboard.nextInt();
        int count = 1;
        while (count<=numberToStop){
            System.out.print(count+" ");
            count++;
            Thread.sleep(1000);
        }
    }
}
