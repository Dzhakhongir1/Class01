package day14_multi_branch_if_statments;
import java.util.Scanner;
public class Calculatorv2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int num1 =scan.nextInt();
        int num2 =scan.nextInt();
        System.out.println("Enter your operator");
        char operator = scan.next().charAt(0);
        if (operator=='+'){
            System.out.println(num1+num2);
        }else if(operator=='-') {
            System.out.println(num1-num2);
        }else if (operator=='*'){
            System.out.println(num1*num2);
        }else if (operator=='/'){
            System.out.println(num1/num2);
        }else{
            System.out.println("You suck at math");
        }
    }
    }

