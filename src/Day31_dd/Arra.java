package Day31_dd;

import java.util.*;

public class Arra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }

        // DO NOT TOUCH ABOVE
        int count =0;
        for(String each:arr){
            System.out.print(each);
            count++;
            if (count>=2){
                System.out.println();
            }


        }
    }
}
