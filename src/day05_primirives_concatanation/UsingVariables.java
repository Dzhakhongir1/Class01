package day05_primirives_concatanation;

public class UsingVariables {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1); //100
        System.out.println(num2); //100

        num1 = 200;
        System.out.println(num1);//200
        System.out.println(num2);//100

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        int n4 = n3;
        int n5 = n4;
        /*
        n1>55
        n2>55
        n>3>55
         */
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n1+ "\n" + n2 + "\n" + n3 + "\n");

        int inthirasZipCode = 22182;
        int parvisZipCode = inthirasZipCode;
        System.out.println(inthirasZipCode);
        System.out.println(parvisZipCode);

        inthirasZipCode = 20007;
        parvisZipCode = 68154;
        System.out.println(inthirasZipCode); //inthirasZipCode; 20007
        System.out.println(parvisZipCode); //parvisZipCode: 22182


    }

}
