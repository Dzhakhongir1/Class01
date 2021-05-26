package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithTheList {
    public static void main(String[] args) {
        pribtStrList(Arrays.asList("java","tea","pea","tuda","suda"));
        List<Integer>nums= new ArrayList<>(Arrays.asList(1,5,6,7,8,9,10));
        System.out.println("\n"+ListOfInt(nums));

    }
    public static void pribtStrList(List<String>list){
        for (String each :list){
            System.out.print(each+" ");
        }
    }
    public static int ListOfInt(List<Integer>nums){
        int total=0;
        for (int each : nums){
            total+=each;
        }
        return total;
    }


}
