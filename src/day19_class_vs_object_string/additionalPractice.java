package day19_class_vs_object_string;
import java.util.Scanner;
public class additionalPractice {
    public static void main(String []args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Your working user name");
        String expUserName = scan.nextLine() ;
        System.out.println("Your working user password");
        String expassword = scan.nextLine();
        System.out.println("Please repeat");
        System.out.println("Your working user name");
        String userName = scan.nextLine() ;
        System.out.println("Your working user password");
        String password = scan.nextLine() ;
        if (expassword.equals(password)&&expUserName.equalsIgnoreCase(userName)){
            System.out.println("pass- user name is seat up enjoy your profile ");
        }else{
            if (expassword.equals(password)){
                System.out.println("invalid password");
            }else {
                System.out.println("Invalid password");
            }
        }
    }
}
