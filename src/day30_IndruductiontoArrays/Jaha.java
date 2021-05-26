package day30_IndruductiontoArrays;

public class Jaha {
    public static void main(String[] args) {
        int []num ={33,44,66,400,22,123,543,999,321,3};
        for (int i : num){
            System.out.print(i+" ");

        }
        System.out.println();
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

        System.out.println(num[num.length-1]);

    }
}
