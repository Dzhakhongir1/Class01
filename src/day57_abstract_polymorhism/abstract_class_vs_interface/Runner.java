package day57_abstract_polymorhism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
//        AbstarcA abstarcA = new AbstarcA();//can not create object
//        InterfaceA iA= new InterfaceA();  //can not create object
        InterfaceA.staticMethodE("wooden spoon");
        ConcreateA.staticMethodC();
    }

}
