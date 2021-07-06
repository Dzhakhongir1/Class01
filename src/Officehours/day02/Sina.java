package Officehours.day02;

import java.util.Locale;

public class Sina {
    public static void main(String[] args) {
        String a ="123";
        String b = 5+4+a;
        System.out.println(b);
        String s= "java ";
        char c =s.charAt(3);
        System.out.println(c);

        String result = 5>(9*1000) ? "garden" : "patio" ;
        result.substring(2);
        System.out.println(result);


        String str = "the game was tied at 2-2";
        String s2 = str.substring(5);

        int index1=str.indexOf("game");
        int index2=s2.indexOf("game");
        if (index1==index2){
            System.out.println(index1);
        }else {
            System.out.println(index2);
        }
        String da = "today i will go to the bitch";
      boolean net= str.substring(12).startsWith("go");
      boolean ab=da.substring(12).startsWith("go");
      String result3= net&&ab ?"go" : "dont go";
        System.out.println(result3);
        String word1= "java";
        int d=0;
        do {
            System.out.println(word1.charAt(d));
             d++;
        }while(d>word1.length());

    }
}
