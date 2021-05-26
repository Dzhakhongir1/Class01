package Officehours.day02;
import java.util.Scanner;
public class DynamicLetters {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Upper or lower case");
        String upperOrLower =scan.nextLine ();
        String ascendingOrDecending=scan.next();
        int starting;
        int ending;
        if (upperOrLower.equals("Upper")){
            starting='A';
            ending= 'Z';
        }else {
            starting = 'a';
            ending='z';
        }
        if (ascendingOrDecending.equals("ascending"))
        for(int i= starting;i<=ending;i++){
            System.out.print((char)i+" ");
        }else {
            for (int i = ending; i >= starting; i--) {
                System.out.print((char) i + " ");
            }
        }
    }
}
