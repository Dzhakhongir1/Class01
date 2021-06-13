package CalledPracticeFromtheBoss;

import java.util.Scanner;
public class DivisionProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Put upper or lower");
        String userInput = scan.nextLine();


        //if a person writes lower then go to the while statement
        if (userInput.equals("Upper")) {
            char alphabet = 'A';
            while (alphabet <= 'Z') {

                System.out.println(alphabet++);

            }

        }
        if (userInput.equals("lower")) {
            char alphabet1='a';
            while (alphabet1 <= 'z') {

                System.out.println(alphabet1++);

            }
        }
    }


}
