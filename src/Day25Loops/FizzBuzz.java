package Day25Loops;

import day23_string_manipulation_whle_loop.trim;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i =1;i<=100;i++){
             if (i%3==0&&i%5==0) {
                 System.out.println(i+" fizz Buzz ");
             }else if (i%3==0) {
                 System.out.println(i+" Fizz");
             }else if(i%5==0){
                         System.out.println(i+" Buzz");
             }



        }

    }
}
