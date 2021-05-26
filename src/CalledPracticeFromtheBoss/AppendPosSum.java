package CalledPracticeFromtheBoss;

import java.util.ArrayList;
import java.util.List;

public class AppendPosSum {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> appendPosSum (ArrayList<Integer>list){
        ArrayList<Integer> newList = new ArrayList<>();
        int sum =0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>=0){
                newList.add(list.get(i));
                sum += list.get(i);
            }

        }
        newList.add(sum);
        return newList;

    }
}
