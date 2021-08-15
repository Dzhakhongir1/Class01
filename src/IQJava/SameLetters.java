package IQJava;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(SameLetters.checkIfSame("java", "avaj"));
    }

    public static boolean checkIfSame(String a,String b){
        char[] num1s =a.toCharArray();
        char[] num2s =b.toCharArray();

        Arrays.sort(num1s);
        Arrays.sort(num2s);
        String num1="";
        String num2="";
        for (char each : num1s) {
            num1+=each;
        }
        for (char each : num2s) {
            num2+=each;
        }
        return num1.equals(num2);
    }


}
