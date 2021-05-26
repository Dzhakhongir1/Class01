package day15_logicalops_switch_ternary;

public class andoperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "book";
        if (onSale&&freeShipping) {
            System.out.println("You should  buy it sir ");
        }else {
            System.out.println("Countinue shopping for good deal on"+itemName );
        }
        boolean Freesheeping = true;
        boolean ItemOnsale = true;
        String name = "Wooden spoon";
        if (Freesheeping&&ItemOnsale&&name.equals("Wooden spoon")){
            System.out.println("Add to card");

        }else {
            System.out.println("Continue shopping for good deal "+name);
        }
        String location = "Omaha";
        int salary = 1200000;
        boolean isRemote = true;
        boolean benefits = true;
        /*
        location is string you have to write location.equals after&& salary more than which s=is'>'
        an boolean condition &&
         */
        if (location.equals("Omaha")&&salary>120000&&isRemote&&benefits){
            System.out.println("I will Accept the offer ");
        }else{
            System.out.println("Unfortunatle  i have to pass");
        }
    }
}
