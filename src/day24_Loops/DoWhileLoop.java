package day24_Loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 1;
        do{
            System.out.println("count ="+count);
            count+=100;
        }while (count<=1000);
        System.out.println("your number is "+ --count);

    }
}
