package saimOnly;

import java.util.Scanner;

public class afsfsa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]+" ");
        }

    }
}
