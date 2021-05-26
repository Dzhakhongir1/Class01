package CalledPracticeFromtheBoss;

import java.util.*;

public class Hide_Password_V2 {
    public static void main(String[] args) {
        String [] password= {"one","apple","hold"};
        List <String> hittenPassword= new ArrayList<>();
        for (String each : password){
            hittenPassword.add(convertToStars(each));
        }
        System.out.println("hidden password"+hittenPassword);
    }
    public static String convertToStars(String str ) {
        String starts = "";
        for (int i =0; i<str.length(); i++){
            starts+="*";
        }
        return starts;
    }

}
