package CalledPracticeFromtheBoss;

import day41_arraylist.ArraysAsList;

import java.util.*;

public class Four_or_Less {
    public static void main(String[] args) {
        List <String> words = new ArrayList<>(Arrays.asList("apples","tree","loop","cat","animal","shortcut"));
       List <String> result=new ArrayList<>();
        for (int i =0; i<words.size(); i++){
            if (words.get(i).length()<=4){
                result.add(words.get(i));
            }
        }
        System.out.println(result);
    }
}
