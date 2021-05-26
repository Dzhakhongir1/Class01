package day13_conditional_statments;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry ;
        if (isHungry=false){
            System.out.println("I'm hungry will go get some food");
        }else{
            System.out.println("Not hungry will keep coding ");
        }


        double price = 130.44;
        boolean isAffordable = price<=200.0;
        if (isAffordable){
            System.out.println("can afford"+isAffordable);

        }else{
            System.out.println("can Afford ");
        }
        boolean isRemoteJob =true;
        if (!isRemoteJob){
            System.out.println("sorry im not interested");

        }else{
            System.out.println("Sure im interested");



    }


    }
}
