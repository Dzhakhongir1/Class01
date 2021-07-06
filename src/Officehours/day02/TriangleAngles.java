package Officehours.day02;
import  java.util.*;
public class TriangleAngles {

        public static String reverse(String input){
            String result = "";
            for(int i =input.length()-1;i>=0;i--){
                result+=""+i;

            }
            return result;

        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(reverse(in.next()));
        }
}
