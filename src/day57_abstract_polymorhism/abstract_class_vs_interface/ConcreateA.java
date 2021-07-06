package day57_abstract_polymorhism.abstract_class_vs_interface;

//multiple intefaces
public class ConcreateA extends AbstarcA implements InterfaceA, IntefaceB {//class can extend one abstract  but can implement
    @Override
    public void absMethodA() {
        System.out.println("abstaract implementation is called");
    }
    @Override
    public void methodB(){
        System.out.println("Method b overridden version is called");
    }
    //@Override static methods are hidden
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }
    @Override
    public void methodD(int num) {
        System.out.println("Method a number is " +num);
    }
}
