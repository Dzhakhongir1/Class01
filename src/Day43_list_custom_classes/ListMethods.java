package Day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getRandomList(10));
    }
    public static List<Integer> getRandomList(int size){
        Random random = new Random();
        List<Integer>nums= new ArrayList<>();
        for (int i = 1; i <=size ; i++) {
            nums.add(random.nextInt(101));
        }
        return nums;
    }
}
