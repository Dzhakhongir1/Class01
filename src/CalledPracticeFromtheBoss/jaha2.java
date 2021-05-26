package CalledPracticeFromtheBoss;

public class jaha2 {
    public static void main(String[] args) {
        String password = "meriya";
        String userName= "Halishambana";
        if (password.length()<5){
            System.out.println("Password cannot be less than 5 characters");
        }else if(password.length()>5) {
            System.out.println("valid password");
            System.out.println(password.replace("meriya","Password")+"- is the new password");
        }else if(password.contains(userName)) {
            System.out.println("Invalid password, username should not be in it");

        }
    }
}
