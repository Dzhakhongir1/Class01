package CalledPracticeFromtheBoss;

import java.util.ArrayList;
import java.util.Arrays;

public class EveryOther {
    public static void main(String[] args) {

    }
    public static ArrayList<String>removeEveryOther(ArrayList<String>words){
        ArrayList<String>list = new ArrayList<>();
        for (int i =0 ; i< words.size();i++){
            if(i%2!=0){
                list.add(words.get(i));
            }
        }
        return list;
    }
}
