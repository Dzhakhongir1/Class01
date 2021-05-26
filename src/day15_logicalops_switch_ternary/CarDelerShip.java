package day15_logicalops_switch_ternary;

public class CarDelerShip {
    public static void main(String[] args) {
        int budget = 5000;
        String model = "toyota";
        int carPrice = 65000;
        if (budget>=carPrice &&(model.equals("toyota")||model.equals("Tesla"))){
            System.out.println("Good price i'll take it ");
        }else if(carPrice>=6000) {
            System.out.println("i will pass");
        }
        int apples =5;

    }
}
