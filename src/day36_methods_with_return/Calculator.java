package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("add= "+add(5.10,16.5));
        System.out.println("devide= "+devide(10,1));
        System.out.println("multi= "+multi(6,10));
        System.out.println("minus= "+minus(600,569));

    }
    public static double add(double num1,double num2){
        double sum = num1+num2;
        return sum;// return num1+num2;
    }
    public static int devide(int num1, int num2){
        int sum1= num1/num2;
        return sum1;
    }
    public static int multi(int num1,int num2){
        int sum2=num1*num2;
        return sum2;
    }
    public static int minus(int num1,int num2){
        int sum3= num1-num2;
        return sum3;
    }

}
