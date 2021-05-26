package day38_methods;
import java.util.Arrays;

import static day38_methods.ArrayUtils.*;
public class ArraysUtilsTet {
    public static void main(String[] args) {
        int []nums={5,23,1,543,90};
        printArray(nums);
        printArray(new int[]{5,20,1,546,90,1});
        System.out.println(sum(nums));
        System.out.println(contains(nums,100));
    }
}
