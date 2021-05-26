package CalledPracticeFromtheBoss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountLetters {
    public static void main(String[] args) {
        List<String> words= new ArrayList<>(Arrays.asList("java","html","javascript","java","word"));
        char targetLetter= 'a';
        int count =0;
        for (String word : words){
           for (int i = 0 ; i<word.length();i++){
               if (word.charAt(i)==targetLetter){
                   count++;
               }
           }
        }
        System.out.println(targetLetter+ " was fount "+count+" times");
    }
}
