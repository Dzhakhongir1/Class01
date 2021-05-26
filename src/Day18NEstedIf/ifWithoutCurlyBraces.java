package Day18NEstedIf;

public class ifWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "pythone";

        if (todaysClass.equals("java")) {
            System.out.println("java is fun");
            System.out.println("java is fun when it works");
        }else {
            System.out.println("second statement" + todaysClass);
        }

        int score=1;
        if (score==1) {
            System.out.println();
        }else if (score ==2){
            System.out.println("score is 2");
        }else if (score==3){
            System.out.println("score is 3");
        }else{
            System.out.println("invalid score");
        }
    }
}
