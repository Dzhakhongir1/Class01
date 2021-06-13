package day51_inheritance.super_keyWord;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyft= new Lyft();
        LyftXl lyftXl= new LyftXl();
        Lux lux = new Lux();
        System.out.println("lyft.calculateRate(8.5) = $" + lyft.calculateRate(8.5));
        System.out.println("lyftXl.calculateRate(8.5) = $" + lyftXl.calculateRate(8.5));
        System.out.println("lux.calculateRate(8.5) = $" + lux.calculateRate(8.5));
    }
}
