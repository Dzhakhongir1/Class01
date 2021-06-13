package day51_inheritance.super_keyWord;

public class Lux extends  Lyft {
    @Override
    public double calculateRate(double miles){
        return super.calculateRate(miles)*1.2;
    }
}
