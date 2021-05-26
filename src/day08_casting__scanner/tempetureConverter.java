package day08_casting__scanner;
import java.util.Scanner;
public class tempetureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***Enter tempeture c to farinheit");
        System.out.println("enter feringeit:");
        double ferenheit = scan.nextDouble();
        double celsius = (ferenheit - 32) * 5 / 9;
        System.out.println("your tempeture is"+celsius +" celsus");
    }
}
