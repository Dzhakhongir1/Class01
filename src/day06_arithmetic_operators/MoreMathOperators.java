package day06_arithmetic_operators;
/*
 int toyotas= 431;
        int hondas=233;
        int vw=2;
        int tesla=20;
        int nissan =1;
        int bmw=155;
        //how many car are there in the parking lot
        System.out.println()
 */
public class MoreMathOperators {
    public static void main(String[] args){
        int hondas = 233;
        int toyotas = 431;
        int tesla = 20;
        int vw = 2;
        int nissan = 1;
        int bmw = 155;
        int totalCarsInParking = toyotas + hondas + nissan + vw +bmw + tesla;
        System.out.println(totalCarsInParking);
        System.out.println("there are: " + totalCarsInParking + " cars in parking lot");
        String pizza = "hawaiian";
        int slices= 8;
        int people = 4;
        int slicesPerPerson = slices/people ;
        System.out.println("there are " + slicesPerPerson+ " slices per person" );
        System.out.println("we order "+ pizza+ " pizza with "+ slices+ " slices, " + people + " people ate " +
                +slicesPerPerson+ " slices each.");

    }
}
