package saimOnly;


import java.util.Arrays;

public class llllh {
    public static void main(String[] args) {
        int [] firstArray={1,3,5,7};
        int [] newArray =new int[firstArray.length*2];
        newArray[newArray.length-1]=firstArray[firstArray.length-1];
        System.out.println(Arrays.toString(newArray));

    }
}
