package day10_shorthand_operators;

public class ShortHandOperatosr {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot= "+cars);
        cars = cars+2;
        System.out.println("cars in parking lot= "+cars);
        cars+=5;
        System.out.println("cars in parking lot= "+cars);
        cars-=6;
        System.out.println("cars in parking lot= "+cars);
        cars*=8;
        System.out.println("cars in parking lot= "+cars);
        cars/=8;
        System.out.println("cars in parking lot= "+cars);
        int electricCars=13;
        electricCars+=cars;
        System.out.println("cars in parking lot= "+electricCars);
        String word = "java";
        System.out.println("word= "+word);
        word=word+"programming";
        System.out.println("word= "+word);

        word+=" is fun";
        System.out.println("word= "+word);
        String selenium = " but selenium is more fun";
        word+=selenium;
        System.out.println("word= "+word);

        word+= 12345;
        System.out.println("word "+word);

        char letter = 'a';
        System.out.println("letter= "+letter);
        letter +=3;
        System.out.println("letter = "+letter);
        letter+= 1;
        System.out.println("letter= "+letter);

        double parkingFee=7.50;
        System.out.println("parking Fee= "+ parkingFee);

        parkingFee-=7.50;
        System.out.println("Parking fee on weekend"+parkingFee);



    }
}
