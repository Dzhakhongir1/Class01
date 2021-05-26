package CalledPracticeFromtheBoss;
import java.util.*;
public class do_Switch {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {5,6,7,89};
        System.out.println(Arrays.toString(do_switch(arr)));
    }


    public static int[] do_switch(int[] i) {
        int []newArray=new int [i.length];

        for (int d= 0;d<i.length;d++){
            if(d==0){
             newArray[3]=i[d];
            }else if(d==1){
                newArray[1]=i[d];
            }else if(d==2){
                newArray[2]=i[d];
            }else if(d==3){
             newArray[0]=i[d];
            }

        }
        return newArray;
    }
}
