package day49_static;

public class StaticMethods {
    int num =10;
    public static void displayMessage(String message){
        System.out.println("mesage "+ message);
        //System.out.println(num);
    }
    public static void anotherStaticMeth(){
        System.out.println("another one");
        displayMessage("wooden spoon");
    }
    public  void instanceMeth() {
        System.out.println("Instance variable ");
    }
}
