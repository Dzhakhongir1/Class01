package day53_inharitance.tesla;

public class CArObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla","s3",24.999,2015,50);
        ec1.drive(10);
        System.out.println(ec1.getMake());
        System.out.println("ec1.getMake() = " + ec1.getMake());
        System.out.println("ec1 get model()= " + ec1.getModel());
        System.out.println("ec1.getPrice() = " + ec1.getPrice());
        System.out.println("ec1.getYear() = " + ec1.getYear());
        System.out.println("ec1.getRange() = " + ec1.getRange());
        if (ec1.getPrice()>10000){
            System.out.println(ec1.getMake()+" -"+ec1.getModel()+" is out of my budget");
        }else{
            System.out.println("Out of the budget");
        }
        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("Tesla","CyberTruck",59990,2022,300);
        System.out.println(ec2);
        System.out.println("Count ="+ElectricCar.getCount());

        Roadster roadster = new Roadster("Roadster",20000,2020,620);
        System.out.println(roadster);
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());

        ModelX modelX = new ModelX("Tesla","ModelX",89990.0,2021,360);
        System.out.println(modelX);
        modelX.drive(10);
        System.out.println("Having luch ");
        modelX.drive(10);
        System.out.println("RAnge remaining "+ modelX.getRange());
        System.out.println("Total elictric cars count = "+ ElectricCar.getCount());



    }
}
