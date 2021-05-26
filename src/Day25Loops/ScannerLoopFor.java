package Day25Loops;
import java.util.*;
public class ScannerLoopFor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your start number");
        int start = scan.nextInt();
        System.out.println("enter your end number");
        int end = scan.nextInt();
        for (int i=start;i<=end;i++){
            System.out.print(i+" ");
        }
        }
    }


