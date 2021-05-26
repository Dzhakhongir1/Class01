package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println(100>10);
        System.out.println(985.44<98547.8);
        System.out.println(10<=9);
        System.out.println(5>=3);
        System.out.println(-100!=44);
        int a =100;
        int b =200;
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>+b);
        System.out.println(a<=b);
        System.out.println(a != b);
        boolean result;
        result = 5==5;
        System.out.println("result = " + result);
        result = 33>44;
        System.out.println("result = " + result);
        result = 88<99;
        System.out.println("result = " + result);
        String city = "seattle";
        System.out.println(city == "seattle");
        System.out.println(city == "baku");
        String name = "nadir";
        boolean cheakName = name == "nadir";
        System.out.println("cheakName = " + cheakName);
        
        cheakName= name!="kuzzar";
        System.out.println("cheakName = " );
    }
}
