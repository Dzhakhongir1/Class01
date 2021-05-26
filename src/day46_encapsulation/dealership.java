package day46_encapsulation;

public class dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        //error bellow model and year are private
        //car1.model = "Nissan Altima";
        car1.setModel("BMW");
        System.out.println(car1.getModel());
        car1.setYear(2019);
        System.out.println(car1.getYear());
        car1.setMileage(69000);
        System.out.println(car1.getMileage()+"k");
        System.out.println(car1.toString());
        System.out.println(car1);
    }
}
