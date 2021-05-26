package day16_switch_ternary;

public class Practive_Mooore {
    public static void main(String[] args) {
        int score= 90;
        String result = (score>50) ? "Pass" : "Fail";
        System.out.println(result);
        int num1 =10;
        int num2 =5;
        int max = (num1>num2) ? num1 : num2;
        System.out.println(max);
        String action;
        boolean isRed = false;
        action = (isRed) ? "can drive" : "stop no more";
        System.out.println(action);

    }
}
