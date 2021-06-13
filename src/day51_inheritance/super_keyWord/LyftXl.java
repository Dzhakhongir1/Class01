package day51_inheritance.super_keyWord;

public class LyftXl extends Lyft {
    @Override
    public double calculateRate(double miles){
        return super.calculateRate(miles)*1.1;
    }
}
