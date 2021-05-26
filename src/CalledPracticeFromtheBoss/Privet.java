package CalledPracticeFromtheBoss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Privet {
    public static void main(String[] args) {
        ArrayList<String>list= new ArrayList<>(Arrays.asList("one apple","two orange","four banana"));
        String find = "four";
        System.out.println(search(list,find));

    }
    public static String search(ArrayList<String>list,String find){
        String result = "";
        for (String each :list)
        if (each.contains(find)){
            result= each;
        }else{
            System.out.println("search failed");
        }
        return result;
    }
}
