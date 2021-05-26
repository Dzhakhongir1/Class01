package Officehours.day02;

import java.util.Arrays;

public class gdsfghdsfhds {
    public static void main(String[] args) {
        int count =0;
        for (int a=0; a<4; a++){
            if (a==3) continue;
            for (int b = a+1;b<5;b++){
                count++;
                if (b==3) break;
            }
        }
        System.out.println(count);


        int [] nums = new int[5];
        int a= 5;
        nums[2]=a;
        nums[0]=a*2;
        nums[4]=nums[1]*a;
        nums[1]=nums[2];
        nums[3]=nums[a-3];
        System.out.println(Arrays.toString(nums));
        String [] str = {"display","population","meeting","copy","franchise"};
        int b = str.length;
        int c= str[5].length();
        System.out.println(b+" "+c);
    }
}
