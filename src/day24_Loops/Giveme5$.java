package day24_Loops;
import java.util.Scanner;
public class Giveme5$ {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int dollar = scan.nextInt();
        while (dollar!=5){
            System.out.println("give me five $"+ "you only gave me "+ dollar);
            dollar=scan.nextInt();
        }

    }
}
