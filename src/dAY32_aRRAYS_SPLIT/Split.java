package dAY32_aRRAYS_SPLIT;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String words = "java,python,selenium,html";
       String []wordsArray= words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array= "+wordsArray.length);
        for(String each:wordsArray){
            System.out.println(each);
        }
        System.out.println("_____________________________________________________________________________________________");
        String sentence= "today i am coding java arrays";
        String []sentenseToArray= sentence.split(" ");
        System.out.println(Arrays.toString(sentenseToArray));
        System.out.println("arrays length= "+sentenseToArray.length);
        for (String each : sentenseToArray){
            System.out.println(each);

        }
    }
}
