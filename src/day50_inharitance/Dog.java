package day50_inharitance;

public class Dog extends Animal {
    public void run(){
        System.out.println(name + " is jumping ");
    }
    @Override
    public void speck(){
        System.out.println("dog is saying ruff woof");
    }
}
