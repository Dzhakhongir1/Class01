package day21_string_manipulation;

import java.sql.SQLOutput;

public class ReplacePtactice {
    public static void main(String[] args) {
        String word ="github";
        System.out.println((word.toUpperCase()));
        System.out.println((word.toLowerCase()));
        System.out.println(word.replace("hub","lab"));
        System.out.println(word.replace("i","o").replace("a","i"));
        String sentense = "java is fun";
        System.out.println(sentense.replace("java","selenium").replace(" ",""));
        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over 4,000 results for java book","4000");
        System.out.println("result = " + result);
    }
}
