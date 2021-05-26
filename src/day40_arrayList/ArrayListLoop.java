package day40_arrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();//Polynomrphic way of declaring
        System.out.println(nums);
        nums.add(37);nums.add(44);nums.add(3);nums.add(88);
        nums.add(500);nums.add(5);nums.add(845);nums.add(0);
        nums.add(800);nums.add(600);nums.add(5+6);nums.add(7);
        System.out.println("nums= "+nums);
        nums.remove(0);
        System.out.println(nums);
//        nums.remove(88);means index 88 int out of Boundexaption
        nums.remove(new Integer(88));//->here we can remove not by index but by number
        nums.remove(new Integer(5));
        System.out.println("nums= "+nums);
        for(int i =0;i<=nums.size()-1;i++){
            System.out.print(nums.get(i));

        }
        System.out.println();
        for (int each:nums){
            System.out.print(each+",");
        }




    }
}
