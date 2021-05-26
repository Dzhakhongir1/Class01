package day30_IndruductiontoArrays;

import java.util.*;

public class JAva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }

        // DO NOT TOUCH ABOVE
        for(int i=0; i<arr.length-1;i++){
            System.out.println(arr[i]+" ");


        }
    }
}
