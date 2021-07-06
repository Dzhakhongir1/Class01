package day53_inharitance.hiding;

public class Parent {
    public String name = "parent > Mikes Smith";
    public void introduce1(){
        System.out.println("Hello i'm "+name);
    }
}
class Child extends Parent{
    public String name = "child > Bob Smith";
    public void introduce2(){
        System.out.println("Hello i am "+name);

    }

}
class Runner {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.introduce1();
        Child child = new Child();
        child.introduce2();
        child.introduce1();
    }
}