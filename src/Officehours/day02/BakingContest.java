package Officehours.day02;

import java.util.Scanner;

public class BakingContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int judge = 1;
        System.out.println("Enter judge "+judge++ + "Score");
        int score1 = scan.nextInt();
        System.out.println("Enter judge "+judge++ + "Score");
        int score2 = scan.nextInt();
        System.out.println("Enter judge "+judge++ + "Score");
        int score3 = scan.nextInt();
        System.out.println("Enter other person 1's score");
        int otherPerson1 = scan.nextInt();
        System.out.println("Enter other person 2's score");
        int otherPerson2 = scan.nextInt();
        int outAverage = (score1+score2+score3) /3;
        if (outAverage>otherPerson1&&outAverage>otherPerson2){
            System.out.println("First place");

        }else if ((outAverage > otherPerson1&&outAverage<otherPerson2)
                ||outAverage > otherPerson1&&outAverage>otherPerson2 ){
            System.out.println("Second place");
        }else{
            System.out.println("Third place");
        }

    }
}
