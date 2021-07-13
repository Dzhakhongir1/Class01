package day61_exeptions_collections;

public class CustomExeptionTest {
    public static void main(String[] args) {
        int minutes=30;
        System.out.println("Class is going on for "+ minutes+ " minutes");
        if (minutes>50){
            throw new BreakTimeExeption();
        }

        double balance=400;
        double itemPrice=500;
        if (itemPrice>balance){
            throw new InsafficientBalanceExeption("You are broke");

        }
    }
}
