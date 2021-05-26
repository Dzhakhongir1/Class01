package DilnozaOnly;
import java.util.Scanner;
public class laaaaaaaaa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("put your number we will multiply");
        double num1 =scan.nextDouble();
        double num2 =scan.nextDouble();
        char operator = '-';
        if (scan.equals('-')){
            System.out.println(num1-num2);
        }else if (operator=='+'){
            System.out.println(num1+num2);
        }else if(operator=='*'){
            System.out.println(num1*num2);
        }else if (operator=='/'){
            System.out.println(num1/num2);
        }else{
            System.out.println("you suck at math");
        }
    }
}
