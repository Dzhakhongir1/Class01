package day40_arrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();
        //Array list internally uses normal arrays . it is based on array
        // it just copies values and becomes resizable
        nums.add(5);
        nums.add(6);
        nums.add(11);
        System.out.println(nums.size());
        System.out.println(nums);
        System.out.println("index 0= "+nums.get(0));
        System.out.println("index 1= "+nums.get(1));
        System.out.println("index 2= "+nums.get(2));
        // id you would like to remove value or index it's easy to do
        nums.remove(1);//<-ex with removing one element
        System.out.println(nums);
    }
}
