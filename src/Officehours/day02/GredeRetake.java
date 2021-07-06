package Officehours.day02;

public class GredeRetake {
    public static void main(String[] args) {
//        int baseGrade = 90;
//        int numberOfAttempts = 3;
//        int retakePenalty = 0;
//        if (numberOfAttempts==1){
//           retakePenalty =(int) (baseGrade * .10);
//        }
//        if(numberOfAttempts==2) {
//            retakePenalty = (int) (baseGrade * .20);
//        }
//        if(numberOfAttempts==3) {
//            retakePenalty = (int) (baseGrade * .30);
//        }
        int baseGrade = 90;
        int numberOfAttempts = 6;
        int retakePenalty = 0;
        if (numberOfAttempts==1){
            retakePenalty =(int) (baseGrade * .10);
        }else if(numberOfAttempts==2) {
            retakePenalty = (int) (baseGrade * .20);
        }else if(numberOfAttempts==3) {
            retakePenalty = (int) (baseGrade * .30);
        }else{
            System.out.println("you failed your test boi");
        }
        System.out.println("Your grade after retake attempt "+numberOfAttempts+" Was:"+(baseGrade-retakePenalty));
    }
}
