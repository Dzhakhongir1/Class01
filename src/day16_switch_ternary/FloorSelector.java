package day16_switch_ternary;

public class FloorSelector {
    public static void main(String[] args) {
        int floor = 1;
        switch (floor) {
            case 1:
                System.out.println("Companies : Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Companies: Cybertek, NASA, Itelsat");
                break;
            case 3:
                System.out.println("Companies:Lyft, Bofa, Stake house");
            default:
                System.out.println("invalid floor");
        }
    }
}
