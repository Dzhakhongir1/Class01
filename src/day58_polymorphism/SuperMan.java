package day58_polymorphism;

public class  SuperMan extends Father implements Workable{
    @Override
    public void work(String job) {
        System.out.println("super man working as " + job);
    }

    @Override
    public double getPaid() {
        System.out.println("SuperMAn is getting paid");
        return 8000;
    }
}
