package day50_inharitance;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name="Gray";
        animal.type="haski";
        animal.speck();

        Cat cat = new Cat();
        cat.speck();

        Dog dog = new Dog();
        dog.speck();
    }
}
