package day57_abstract_polymorhism.abstract_class_vs_interface;

public abstract class AbstarcA {
    int num1;
    private double price;
    public static int count;
    public static final String Type = "abstract";
    public static final String Language ="java";
    public abstract void absMethodA();

    public AbstarcA(){
        System.out.println("AbstractA constructor");
    }

    public void methodB(){
        System.out.println("methodB called");
    }
    public static void staticMethodC(){
        System.out.println("static methodC is called");
    }



}
