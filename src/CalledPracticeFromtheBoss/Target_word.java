package CalledPracticeFromtheBoss;

import java.util.*;

public class Target_word {
    public static void main(String[] args) {
        List<String> words= new ArrayList<>(Arrays.asList("java","html","javascript","java","word"));
        String targetWord= "java";
        int count =0;
        for (String word : words){
            if (word.equals(targetWord)){
                count++;
            }
        }
        System.out.println(targetWord+ " was fount "+count+" times");
    }
}
