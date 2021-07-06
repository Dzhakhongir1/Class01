package saimOnly;

import java.util.Arrays;
import java.util.TreeSet;

public class CodingBAt {
    public static void main(String[] args) {
        /*
 Given a string, return a version where all the "x" have been removed. Except
 an "x" at the very start or end should not be removed.
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
         */
    CodingBAt codingBAt = new CodingBAt();
        System.out.println(codingBAt.removeDup("AAABBCCC"));


    }
    public static String removeDup(String str){
        String nonDup="";
        for (int i = 0;i<str.length();i++){
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup+= ""+str.charAt(i);
            }
        }
        return nonDup;
    }

}
