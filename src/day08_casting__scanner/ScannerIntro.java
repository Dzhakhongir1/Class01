package day08_casting__scanner;


import java.util.Scanner;



public class ScannerIntro {
    public static void main(String[] args) {
        //type on type of the class
        // import java.util.Scanner:
        Scanner scan = new Scanner(System.in);
        // create scanner object using new keyword
        ///EX: Scanner scan = new Scanner(System.in);
        System.out.println("This is the first step: ");

        String firstName = scan.next();
        String lastname = scan.next();
        int first = scan.nextInt();
        int second = scan.nextInt();

        System.out.println(" This is the result of the first scan "+firstName + lastname + (first+second));

        Scanner scan1 = new Scanner(System.in);
        System.out.println("This happens after the results of the first scanner: ");

        String firstName1 = scan.next();
        String lastname2 = scan.next();
        int first3 = scan.nextInt();
        int second4 = scan.nextInt();
        System.out.println(" This is the result of your second scanner, " + "new" +firstName1 + lastname2 + (first3+second4));
    }
}
