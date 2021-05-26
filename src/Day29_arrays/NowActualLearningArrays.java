package Day29_arrays;

public class NowActualLearningArrays {
    public static void main(String[] args) {
        int [] nums = new int [3];//declare  and assign the value down below is the ex
        nums[0] =5;
        nums[1]=10;
        nums[2]=7;

        System.out.println(nums.length);
        int  len = nums.length;
        System.out.println("len = " + len);
        nums[0]=100;
        nums[1]=500;
        nums[2]=100;
        System.out.println(nums[2]);

        /*
        second way is a shorter way to assigh value besically same line Ex
        int [] nums = {234,12,343,545,234,222,99};
         */
        int [] nums1=new int[]{234,12,343,545,234,222,99};
        System.out.println(nums1.length);
        System.out.println(nums1[0]);

        double [] prices = new double []{10.3,44.0,50.0};


    }
}
