package day19_class_vs_object_string;

public class LogInTest {
    public static void main(String [] args){
        String expUserName = "cybertek";
        String exppassword = "Abc123";

        String userName = "Cyberteck";
        String password = "Abc123";
        if (expUserName.equalsIgnoreCase(userName) && exppassword.equals(password)){
            System.out.println("Pass user seccessfully logged in");
        }else {
            if (exppassword.equals(password)){
                System.out.println("incorrect password");
            }else {
                System.out.println("incorrect password");
            }
        }
    }
}
