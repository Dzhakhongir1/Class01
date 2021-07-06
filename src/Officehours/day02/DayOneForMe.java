package Officehours.day02;

public class DayOneForMe {
    public static void main(String[] args) {
//        int a = 200;
//        int b = -a++ + - --a * a-- %2 +a;

        int number = 65;
        String convert =""+ number;
        boolean by2 = number %2 ==0;
        boolean by3 = number %3 ==0;
        boolean by5 = number% 5==0;
        System.out.println(number+ "is devisivle by 2:"+by2);
        System.out.println(number+ "is devisivle by 3:"+by3);
        System.out.println(number+ "is devisivle by 5:"+by5);
    }
}
