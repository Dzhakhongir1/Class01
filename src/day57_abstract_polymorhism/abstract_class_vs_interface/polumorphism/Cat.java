package day57_abstract_polymorhism.abstract_class_vs_interface.polumorphism;

public class Cat extends Animal {
    @Override
    public void makesNoise() {
        System.out.println("cat is saying meaw");
    }
}
