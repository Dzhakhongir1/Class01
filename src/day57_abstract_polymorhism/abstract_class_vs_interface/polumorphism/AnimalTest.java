package day57_abstract_polymorhism.abstract_class_vs_interface.polumorphism;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Animal(); // not polimophism
        Animal a2 = new Cat();
        a2.makesNoise();

        Animal a3 = new Dog();
        a3.makesNoise();

        Animal a4 = new Horse();
        a4.makesNoise();
    }
}
