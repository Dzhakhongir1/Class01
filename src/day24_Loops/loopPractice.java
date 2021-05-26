package day24_Loops;
import java.util.Scanner;
public class loopPractice {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner (System.in);
        System.out.println("Worlds smallest cat hit play ");
        double seconds = scan.nextDouble();
        while (seconds<=117){
            System.out.println("watching video"+seconds++);
            Thread.sleep(1000);

        }
        System.out.println("Video stopped ");
    }
}
