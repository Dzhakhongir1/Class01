package saimOnly;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean is55=false;
        int[] nums = {1,5,5,1,1};
        for (int i=0;i<nums.length; i++){
            if (nums[i]==5&&nums[i+1]==5){
                is55=true;
            }
        }
        System.out.println(is55);

        //T Type your code below:

    }
}
