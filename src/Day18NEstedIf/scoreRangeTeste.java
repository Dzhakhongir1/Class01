package Day18NEstedIf;
import java.sql.SQLOutput;
import java.util.Scanner;
public class scoreRangeTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please put your score");
        int score = scan.nextInt();
        String note= scan.nextLine();
        if (score>1&&score<40){
            System.out.println("D");
            note = "Try harder next time";
        }else if (score>40&&score<60){
            System.out.println("C");
            note = "Do more practice ";
        }else if (score>61&&score<90){
            System.out.println("B");
            note = "not bad but not a yet keep working hard";
        }else if (score>90&&score<100) {
            System.out.println("A");
            note = "great job ";
        }else{
            System.out.println("invalid score ");
        }
        System.out.println(score+" Passed "+note);
    }
}
