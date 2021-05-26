package CalledPracticeFromtheBoss;

import java.util.Arrays;

public class jaha3 {
    public static void main(String[] args) {
        int []something={5,6,7,8,9};
        System.out.println(Arrays.toString(do_switch(something)));

    }
    public static int[] do_switch(int[] i) {
        int []newArray=new int [i.length];
        for (int j = i.length,k=0;j<newArray.length;j--,k++){
            newArray[k]=i[j];
            
        }
        return newArray;
    }
}
