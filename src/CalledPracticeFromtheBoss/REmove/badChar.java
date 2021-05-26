package CalledPracticeFromtheBoss.REmove;

import java.util.*;

public class badChar {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i=0; i < size; i++){
                nums[i] = scan.nextInt();
            }
            printUniqueNumbers(nums);
        }

        public static void printUniqueNumbers(int[] nums){
            //WRITE YOUR CODE HERE
            ArrayList<Integer> total= new ArrayList<>();
            ArrayList<Integer>nums1= new ArrayList<>();
            for  (int i =0; i<nums.length;i++){
                nums1.add(nums[i]);
            }//2, 5, 5, 6, 3, 6, 9, 34, 3]
            for(int each :nums1){
                if (!total.contains(each)){
                    total.add(each);
                    System.out.println(each);
                }else if(total.contains(each)){
                    total.remove(each);
                }
            }




        }
    }

