package Officehours.day02;

public class Piritic {
    public static void main(String[] args) {
        //print longest substring
        String str= "aaabbbccccccdddeee";
        String longestSubstring ="";
        String temp = "";
        for (int i =0; i<str.length()-1;i++){

            temp+=str.charAt(i);

            if (str.charAt(i)!=str.charAt(i+1)){
                if(temp.length()>longestSubstring.length()){
                    longestSubstring=temp;
                }
                temp="";

            }

        }
        System.out.println(longestSubstring);


    }
}
