package Day18NEstedIf;

public class FizzBuzz {
    public static void main(String[] args) {
        int num = 15;
        if (num %3==0&&num%5==0){
            System.out.println("FizzBuzz");
        }else if(num%3==0){
            System.out.println("Fizz");
        }else if(num%5==0){
            System.out.println("Buzz");
        }
    }
}
