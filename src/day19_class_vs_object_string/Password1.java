package day19_class_vs_object_string;
import java.util.Scanner;
public class Password1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please put your pin");
        String password = scan.nextLine();
        if (password.length()>=6){
            System.out.println("Good job you know what 6 character means");
        }else {
            if (password.length()<=5){
                System.out.println("Need more characters");
            }else {
                System.out.println("Put more characters");
            }
        }

    }
}
