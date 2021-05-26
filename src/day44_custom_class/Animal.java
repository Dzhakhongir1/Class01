package day44_custom_class;

public class Animal {
    String type="Monkey";

    public void meth(){
        System.out.println("eat speack");
    }
    public void meth(String food){
        System.out.println("eat speack"+food);
    }
    public void speak(){
        System.out.println("speaking");

    }


    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.meth();
        animal.meth(" Poo");
        System.out.println(animal.type);
        animal.speak();
        Animal animal2= new Animal();
        animal2.type= "cheetah ";
        System.out.println(animal2.type);

    }
}
