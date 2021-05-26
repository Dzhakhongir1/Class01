package CalledPracticeFromtheBoss;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

public class Find_sum {
    public static void main(String[] args) {
        String sentence = "i have 20 $ , and borrow 15 from my frind and also get 85 from atm";
        System.out.println(sumChar(sentence));

    }
    public static int sumChar(String str){
        String num = "0";
        int sum =0;
        char [] characters= str.toCharArray();

        for (int i =0;i<characters.length;i++)      {
            if (Character.isDigit(characters[i])){
                num+=characters[i];
            }
            if (i==characters.length-1||!Character.isDigit(characters[i+1]))
            sum+=Integer.parseInt(num);
            num="0";
        }
        return sum;
    }

}
