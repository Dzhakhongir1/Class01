package day15_logicalops_switch_ternary;

public class GredeEvaluator {
    public static void main(String[] args) {
        char grade = 'F';
        if (grade =='A'||grade=='B'||grade=='C'){
            System.out.println("passing");
        }else if (grade=='D'){
            System.out.println("Qualify for retake");
        }else if (grade=='F'){
            System.out.println("fail");
        }else{
            System.out.println("Invalid grade");
        }
    }
}
