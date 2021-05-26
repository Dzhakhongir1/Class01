package Day33_array;
import java.lang.reflect.Array;
import java.util.*;
public class Regularexp {
    public static void main(String[] args) {
        String word= "java1sql2html";
        String []arrStr= word.split("\\d");
        System.out.println(Arrays.toString(arrStr));
        word= word.replaceAll("\\d","_");
        System.out.println(word);

        String password ="Abcd123_5";
        if (password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")){
            System.out.println("valid password");
        }else{
            System.out.println("Valid password");
        }


    }
}
