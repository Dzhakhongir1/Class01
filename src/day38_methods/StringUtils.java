package day38_methods;

import java.util.Locale;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("dgf"));
        String word = null;
        /*
  if (str.isEmpty || word == null ){ → this will give NullPointerException
 if(word == null || word.isEmpty()) { → this will be true, NO ERROR
 if(word == null | word.isEmpty()) { → this will give NullPointerException because you
 are using one pipe which forces the program to check both sides
         */
        System.out.println(IsPalindrome("civic"));
    }
    public static boolean isNullOrEmpty(String str){
        return (str==null||str.isEmpty());
//        if (str==null||str.isEmpty()){
//            return true;
//        }else {
//            return false;
//        }
    }
    public static boolean IsPalindrome(String str){
     str = str.toLowerCase();
     for (int i=0; i<str.length()/2;i++){
         if (str.charAt(i)!=str.charAt(str.length()-1-i)){
             return false;
         }
     }
     return true;

    }
    public static String reverse(String str){
        String word = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            word +=str.charAt(i);
        }
        return word;
    }
    public static String get2(String input){
        String letters="";
        for (int i = 0; i <=input.length()-1 ; i+=2) {
            letters += input.charAt(i);
        }
        return letters;
    }
}
