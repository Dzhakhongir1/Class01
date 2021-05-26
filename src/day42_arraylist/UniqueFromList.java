package day42_arraylist;
import java.util.*;
public class UniqueFromList {
    public static void main(String[] args) {
        //declare integer arrays list with following numbers
        List <Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,6));
        List<Integer> uniqueList = getUniqueIntegers(nums);
        System.out.println("\n"+uniqueList);
    }

    private static List<Integer> getUniqueIntegers(List<Integer> nums) {
        List <Integer > uniqueList = new ArrayList<>();
        //loop thru the list
        for (int each : nums){
         //   check if number appers ones in the list
            if (Collections.frequency(nums,each)==1){
                System.out.print(each);

                uniqueList.add(each);
            }
        }
        return uniqueList;
    }
}
