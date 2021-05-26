package Officehours.day02;

public class practice16032021 {
    public static void main(String[] args) {
        int time = 8;
        if (time<0|| time>24){
            System.out.println("Invalid time");
        }else if (time >=8&&time<=23){
            System.out.println("campus is open");
        }else {
            System.out.println("campus is closed");
        }
    }
}
