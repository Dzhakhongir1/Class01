package CalledPracticeFromtheBoss;
import java.util.Scanner;
public class Jaha1 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please put your text here");
        String word1 = scan.nextLine();
        if (word1.contains("idiot")||word1.contains("dumb, heck")){
            System.out.println("Message not sent");
        }else {
           System.out.println("Message sent");
        }
    }
}
