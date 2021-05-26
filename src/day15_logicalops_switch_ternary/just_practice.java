package day15_logicalops_switch_ternary;
import java.util.Scanner;
public class just_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please put your grade ");
        char grade = scan.next().charAt(0);
        if (grade =='A'||grade=='B'||grade=='C'){
            System.out.println("passing");
        }else if (grade=='D'|| grade=='b'){
            System.out.println("Qualify for retake");
        }else if (grade=='F'){
            System.out.println("fail");
        }else{
            System.out.println("Invalid grade");
        }
    }
}
