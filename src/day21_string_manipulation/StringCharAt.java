package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word ="javaa";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        String company = "cybertek";
        char first = company.charAt(0);
        char second =           company.charAt(1);
        char third =            company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth =            company.charAt(5);
        char seventh =  company.charAt(6);
        char eight = company.charAt(7);
        System.out.println(first+" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth+" "+seventh+" "+eight);
        String withSpaces = (first+" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth+" "+seventh+" "+eight);
        System.out.println("withSpaces "+withSpaces);





    }
}