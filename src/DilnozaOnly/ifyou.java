package DilnozaOnly;

import java.util.Arrays;

public class ifyou {
    public static void main(String[] args) {
       String word = "jahongir likes to buy a car for 4000 dollors";
       String [] wordArray= word.split(" ");
       String [] reversed = new String[wordArray.length];
       for (int i = wordArray.length-1; i>=0; i--){
           for (int j =0; j< reversed.length;j++){
               reversed[j]+=wordArray[i];
               break;
           }
       }



        System.out.println(Arrays.toString(reversed)+" ");
    }
}
