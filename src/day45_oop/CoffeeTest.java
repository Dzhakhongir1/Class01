package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee coffe1 = new Coffee();
        System.out.println(coffe1.getAmount());
        coffe1.refill();
        System.out.println("amount after refill "+coffe1.getAmount());
        coffe1.drink(10);
        System.out.println("amount after drinking "+coffe1.getAmount());
        coffe1.setType("nescafe");
        System.out.println(coffe1.type);
        Coffee cofe2 = new Coffee();
        cofe2.setType("Nescafe");
        System.out.println(cofe2.getType());
        Coffee cofe3= cofe2;
        System.out.println(cofe3.getType());
        cofe3.setType("expresso");
        Coffee cofe4 = new Coffee();
        cofe4 = cofe3;
        System.out.println(cofe4.getType());
        Coffee cofe5 =null;
        cofe5.setType("turkish");//reference point does not
        System.out.println(cofe5.getType());//null pointerExeption
    }
}
