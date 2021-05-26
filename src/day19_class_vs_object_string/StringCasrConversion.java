package day19_class_vs_object_string;

import java.util.Locale;

public class StringCasrConversion {
    public static void main(String[] args) {
        String word = "CyBErTek";
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        String wordInLowercase= word.toLowerCase();
        System.out.println("Word to lower "+wordInLowercase);
        word = word.toLowerCase();
        System.out.println("word ="+word);


    }
}
