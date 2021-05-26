package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        int numberOfBedrooms = 0;
        int startingPrice = 0;
        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bedroom apartments selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice =2899;
            default:
                System.out.println(" 3 bedroom not available");



        }
        System.out.println("you selected "+numberOfBedrooms+" bedroom apartment it will be just: $"+startingPrice+" a month ");
    }
}
