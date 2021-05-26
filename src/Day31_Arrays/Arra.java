package Day31_Arrays;
import java.util.*;
public class Arra {
    public static void main(String[] args) {
        int []nums={5,6,10,30,-1,-3,1,3};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums));

        System.out.println("min value:"+nums[0]);
        System.out.println("max value:"+nums[nums.length-1]);

        String [] words ={"Java","C#","Kotlin","Python","Ruby","Assembly"};
        Arrays.sort(words);
        System.out.println("["+String.join(", ",words)+"]");
        Arrays.sort(words,Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
