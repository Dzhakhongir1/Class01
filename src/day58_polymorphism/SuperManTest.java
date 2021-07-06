package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father man = new SuperMan();
        man.raiseLid();
        man.feedKid();
        man.playWithKid();
        Workable man2 = new SuperMan();
        man2.work("Sdet");
        System.out.println("man2.getPaid() = " + man2.getPaid());
    }
}
