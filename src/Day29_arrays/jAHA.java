package Day29_arrays;

import java.util.Scanner;

public class jAHA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int count = 0;
        for (int i = 0; i < 1; i++) {
            for (int inner =0; inner<word.length(); inner++){
                if (word.equalsIgnoreCase("java")) {
                    count++;
            }
                System.out.println(count);
            }
//            System.out.println(count);

        }

    }
}