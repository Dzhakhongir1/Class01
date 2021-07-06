package day57_abstract_polymorhism.abstract_class_vs_interface;

public interface InterfaceA {
    public static final String Type ="interface";
    double Max_Count= 500; // is also public static final

    public abstract void methodD(int num);
    public static void staticMethodE(String str){
        System.out.println("static methodE is called with str -" +str);
    }
    public default  void defaultMethodF(){
        System.out.println("default method F is called ");
    }

}
