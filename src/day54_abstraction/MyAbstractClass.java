package day54_abstraction;

public abstract class MyAbstractClass {
    public void lear(){
        System.out.println("Learning...");
    }
    public abstract
    void close();
}

class Sub extends  MyAbstractClass{
    public void close (){
        System.out.println("Close - abstract method implementation");
    }
}



class MyObjects{
    public static void main(String[] args) {
        //line belllow will not work
       // MyAbstractClass mac = new MyAbstractClass();
    }
}
