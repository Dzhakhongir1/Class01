package CalledPracticeFromtheBoss;

import java.util.*;

public class StringNumberOfSum {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("123","54","24"));
        for (int i =0; i<list.size(); i++){
            int totalSum = 0;
            for (char digit : list.get(i).toCharArray()){
            totalSum +=Integer.parseInt(""+digit);

            }
            list.set(i,""+totalSum);
        }
        System.out.println(list);
    }
}
