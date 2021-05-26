package day17_ternary_nested_conditions;

public class Ternary_examples {
    public static void main(String[] args) {
        int score =50;
        String result = (score>60) ? "pass" : "fail";
        String quality = "good";
        int x = (quality.equals("good")) ? 100:0;
        int score1= 100;
        char grade =(score1>90) ? 'A' : 'B';
        int score2 = 10;
        String evenOdd = (score%2==0) ? "even" : "odd";
        System.out.println(result);
        System.out.println(x);
        System.out.println(grade);
        System.out.println(evenOdd);
    }
}
