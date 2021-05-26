package day15_logicalops_switch_ternary;

public class OrLogicalOperator {
    public static void main(String []args){
        System.out.println("true || true ="+(true||true));
        System.out.println("true || true ="+(true||false));
        System.out.println("true || true ="+(false||true));
        System.out.println("true || true ="+(false||false));
        System.out.println();
        int apples = 5;
        int oranges =10;
        if (apples ==1 ||  oranges==5){
            System.out.println("We need to purchase some more oranges and apples");
        }else{
            System.out.println("we are good with fruits");
        }
    }
}
