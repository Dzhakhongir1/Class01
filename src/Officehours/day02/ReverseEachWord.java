package Officehours.day02;

import day38_methods.StringUtils;

public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("it started to snow in chicago"));
    }
   public static String reverseEachWord(String str){
       String reverse = "";

       for (String each :str.split(" ")){
           String eachReverse="";
           // here we would reverse each string with a for loop
           //going from the last index to the first index
           reverse +=StringUtils.reverse(each)+" ";
       }
       return reverse.trim();
   }
}
