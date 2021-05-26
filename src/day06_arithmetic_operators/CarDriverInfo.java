package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Jeep Wrangler";
        String driverName = "Batman";
        String licenseNumber = "btm123";
        short speed = 80;
        boolean isAutomatic = false;
        char licenseClass = 'd';
        System.out.println(carModel +" is car model");
        System.out.println("Driver name: "+ driverName);
        System.out.println(driverName + " is driving a car");
        System.out.println(driverName + " is driving "+ carModel);
        System.out.println("current speed is: " +  speed );
        System.out.println("current speed: " + speed +"mph" );
        System.out.println("is it automatic true/false: " + isAutomatic);
        System.out.println(licenseClass +" " + isAutomatic );
        System.out.println(licenseClass+" - " +isAutomatic);

        String str = "My Name is ";
        String firstName= "Jaha";
        System.out.println(str+ firstName);
        int i = 11;
        int j = 5;
        System.out.println(i%j);

    }
}
