package day41_arraylist;

import java.util.Arrays;
import java.util.*;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer>nums = Arrays.asList(23,1,34,54,654);
        System.out.println("nums ="+nums);
//        nums.add(100);  does not work
        // bc of as list
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(4,2,4,23,35344,100));
        nums2.add(33);
        nums2.add(56);
        System.out.println("nums list = "+nums2 );
        nums2.remove(0);
        nums2.remove(new Integer(23)); // how to remove numbers from the list
        System.out.println(nums2);

        List<String> drinksWithCaffeine= new ArrayList<>(Arrays.asList("coffee","tea","monster",
         "red bull","coke","pepsi","mdew","kambucha","celsius"));
        int caffeineAmount = 0;
        System.out.println(drinksWithCaffeine);


        for (String each : drinksWithCaffeine) {
            if (each.equals("coffee") || each.equals("tea") || each.equals("monster")) {
                caffeineAmount = 150;
                System.out.println(each + "->>>" + caffeineAmount);
            } else if (each.equals("red bull") || each.equals("coke") || each.equals("pepsi")) {
                caffeineAmount = 100;
                System.out.println(each + "->>" + caffeineAmount);
            } else if (each.equals("mdew") || each.equals("kambucha") || each.equals("celsius")) {
                caffeineAmount = 35;
                System.out.println(each + "->>" + caffeineAmount);
            }
        }

    }
}
