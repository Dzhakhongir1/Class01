package day38_methods;

public class print1_100usingRecustion {
    public static void main(String[] args) {
        to100(1);
    }
    public static void to100(int num){
        System.out.print(num+" ");
        num++;
        if (num<=100)
        to100(num);
    }
}
