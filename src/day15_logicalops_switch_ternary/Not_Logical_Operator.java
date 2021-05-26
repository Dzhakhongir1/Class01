package day15_logicalops_switch_ternary;

public class Not_Logical_Operator {
    public static void main(String[] args) {
        System.out.println("!not true ="+(!true));
        int age =2;
        if (!(age >5)){
            System.out.println("Need to sit in child car seat");
        }
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed){
            System.out.println("find a different place ");
        }else{
            System.out.println("just smoke there ");
        }
        boolean isAffordable = true;
        if (!isAffordable){
            System.out.println("Item not affordable");
        }else{
            System.out.println("is affordable ");
        }
        String env = "qa";
        if (!env.equals("qa")){
            System.out.println("in wrong envirinment for qa testing");

        }
        String model = "tesla";
        if (!model.equals("tesla")){
            System.out.println("not interested");
        }
        String secretPassword = "abc123";
        String inputPassword = "abs321";
        if (inputPassword!=secretPassword){
            System.out.println("Incorrect password");

        }else{
            System.out.println("Correct password");
        }
    }
}
