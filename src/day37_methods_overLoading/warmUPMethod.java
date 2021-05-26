package day37_methods_overLoading;

public class warmUPMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent","abcd123");
        loginVoid("negativetest","abc123");
        System.out.println(logIn("jahaBoss","cyber123"));
        System.out.println(logIn("JAHABOSS","cyber123"));
        System.out.println(logIn("JAhaboss","he the one"));
        if(logIn("JAhaboss","cyber123")){
            System.out.println("log in seccseful , welcome nack to Canvas");
        }else {
            System.out.println("log in failed");
        }
        boolean isLogINSuccess = logIn("nadir","mountain");

        System.out.println("is log in success "+isLogINSuccess);
        if (logIn("nadir","mountain")){
            System.out.println("Welcome to cnavas select course or calendar");
        }else {
            System.out.println("something went wrong with your credentials ");
        }

    }

    public static void loginVoid(String userName,String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abcd123";
        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            System.out.println("Welcome Cybertek student");
        } else {
            System.out.println("wrong user name or password");
        }
    }

    public static boolean logIn(String username,String password){

        String secretUserName = "jahaBoss";
        String secretPassword = "cyber123";
        if (secretUserName.equalsIgnoreCase(username)&&secretPassword.equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
