package day17_ternary_nested_conditions;

public class AmazonprimeShopping {
    public static void main(String[] args) {
        int itemPrice =30;
        boolean isPrimeMember = false;
        if (isPrimeMember){
            System.out.println("Eligible for free shipping");
        }else{
        if (itemPrice>25) {
            System.out.println("Eligible for free  regular days shipping");
        }else{
            System.out.println("not eligible for free shipping ");
        }
        }
    }
}
