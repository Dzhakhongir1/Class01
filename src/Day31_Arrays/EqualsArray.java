package Day31_Arrays;
import java.util.*;
public class EqualsArray {
    public static void main(String[] args) {

        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};
        String[] cars1 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars2 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars3 = {"toyota", "honda", "tesla", "bmw", "dodge"};
        String[] cars4 = {"Toyota", "Honda", "Tesla"};

        System.out.println("nums 1==nums 2 " + Arrays.equals(nums1, nums2));
        System.out.println(nums1 == nums2);
        if (Arrays.equals(nums1, nums2)) {
            System.out.println("num1 and num 2 match");
        } else {
            System.out.println("not matching ");
        }
        if (Arrays.equals(nums2, nums3)) {
            System.out.println("num2 and nums 3 march");
        } else {
            System.out.println("nums2 and nums3 not matching ");
        }
        System.out.println(Arrays.equals(cars1,cars2));
        System.out.println(Arrays.equals(cars2,cars3));
    }

}
