package day11_comparison_operators;

public class prePostIncrementDecrement_operators {
    public static void main(String[] args) {
        // pree increment ex
        int num1 = 10;
        ++num1;
        int num2= ++num1;
        System.out.println("num ="+ num1);
        System.out.println("num2="+num2 );
        //postt increment ex
        int num3 =8;
        int num4 = num3;
        num3++;
        System.out.println("num 3 =" +num3);
        System.out.println("num 4 ="+ num4);
        int apples = 5;
        int basket = ++apples;
        System.out.println("apples ="+ apples );
        System.out.println("basket ="+ basket);
        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = "+kiwi);
        System.out.println("kiwiBusket =" +kiwiBasket);

        int cars = 5;
        System.out.println(++cars);
        int sedan = 10;
        System.out.println(sedan++);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = "+a);
        System.out.println("b = " +b);
        System.out.println("c ="+c);

    }

}
