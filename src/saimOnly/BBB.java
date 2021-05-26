package saimOnly;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BBB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        String newWord="";
        for(String each :words){
            newWord+= (each.charAt(0)+""+each.charAt(each.length()-1)) + " ";
        }

        System.out.println(Arrays.toString(newWord.split(" ")));
    }
}
