package day48_constructor_static;

import Officehours.day02.D;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver= new Driver("Murodil");
        bus.engine= new Engine(10);
        System.out.println(bus);
        Bus metroBus= new Bus();
        metroBus.driver =new Driver("Jaha");
        metroBus.engine= new Engine(10);
        System.out.println(metroBus.driver.getName());
    }
}
