package day50_inharitance;

public class Cat extends Animal {
    public void jump() {
        System.out.println(name + " is jumping ");

    }
    @Override
    public void speck (){
        System.out.println("cat is saying meaw");
    }
}
