package Day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {

        //System.out.println(getIntegerList());
        int []arr=getIntegerArray();
        System.out.println();
    }
    public static List<Integer> getIntegerList(){
        List <Integer> nums = new ArrayList<>();
        for (int i = 0; i <1000000 ; i++) {
            nums.add(i);
        }
        return nums;
    }
    public static int[]getIntegerArray(){
        int [] nums = new int  [1000001];
        for (int i = 0; i <=1000000 ; i++) {
            nums[i]=i;
        }
        return nums;

    }



}
