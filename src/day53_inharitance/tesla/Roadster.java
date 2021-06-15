package day53_inharitance.tesla;

public class Roadster extends ElectricCar {

    public Roadster( String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);
    }
}
