package day16_switch_ternary;


public class CappuccinoBuyer {
    public static void main(String[] args) {
//        declare
//        price    ->
//                calories ->
//                        size could be "tall", "grade" ,"venti"
//
//        when size = "tall"
//        print "Tall Cappuccino please"
//        price    ->  3.69
//        calories ->  90
//
//        when size = "grade"
//        print "Grande Cappuccino please"
//        price    ->  3.99
//        calories ->  120
//
//        when size = "venti"
//        print "Venti Cappuccino please"
//        price    ->  4.29
//        calories ->  150
//
//        any other size:
//        print "We do'nt serve that size of Cappuccino"
//
//
//        print "Total price: $3.69"
//        "You will consume 90 cal of energy"
        String size = "grande";
        double price = 0;
        int calories = 0;
        switch (size){
            case "tall":
                System.out.println("Cappuccino Tall size ");
                price = 5.99;
                calories =156;
                break;
            case "venti":
                System.out.println("Venti Cappuccino please ");
                price = 6.99;
                calories =200;
                break;
            case "grande":
                System.out.println("Grande Cappuccino please "+price+calories);
                price = 9.99;
                calories =356;
                break;
            default:
                System.out.println("i'm good on that ");
        }
        System.out.println("Total price: $" +price);
        System.out.println("You will be having this much calories: "+calories);
    }
}
