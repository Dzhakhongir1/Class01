package day24_Loops;

public class lop {
    public static void main(String[] args) {
        int count = 5;
        while (count>=0){
            System.out.println("count "+count);
            count--;
        }
        int unreadSMS= 10;
        while (unreadSMS>=1){
            System.out.println("you've read message #"+unreadSMS);
            unreadSMS--;
        }
        System.out.println("You are all clear ");
    }
}
