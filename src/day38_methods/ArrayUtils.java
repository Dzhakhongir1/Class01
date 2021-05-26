package day38_methods;

import java.util.Arrays;

public class ArrayUtils {
    public static void printArray(int []nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static int sum(int []nums){
        int total = 0;
        for(int each:nums){
            total+=each;
        }
        return total;
    }
    public static boolean contains(int []nums,int num){
        boolean thatNum=true;
        for (int each :nums){
            if (each==num) {
                thatNum=true ;
            }else{
                thatNum=false;
            }
        }
        return thatNum;
    }
}
