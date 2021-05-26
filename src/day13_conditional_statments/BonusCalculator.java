package day13_conditional_statments;

public class BonusCalculator {
    public static void main(String[] args) {
        int bonus = 10;
        double salesAmout = 2000.55;
        if (salesAmout<5000) {
            System.out.println("GOOD JOB,YOU QUALIFIED FOR BONUS");
            bonus =50;
        }else{
            System.out.println("GREAT JOB . YOURE QUALIFIED FOR FULL BONUS");
            bonus = 100;
        }
        System.out.println("YOUR TOTAL BONUS : $"+bonus);
    }
}
