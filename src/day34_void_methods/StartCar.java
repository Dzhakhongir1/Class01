package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }
    public static void seatInCar(){
        System.out.println("1. Open the door and get seated in the driver seat");

    }
    public static void startTheCar(){
        System.out.println("2.Put the keys inside of the ignition or if it's expensive car press start stop");
    }
    public static void shiftToDrive(){
        System.out.println("3.Look down to your right side and find shifter press brakes and swich from p to d");
    }
    public static void pressGasPedal(){
        System.out.println("4.Slowly pres gas pedal for the car to get going  ");
    }
}
