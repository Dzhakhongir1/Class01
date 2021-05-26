package day10_shorthand_operators;

import javax.lang.model.SourceVersion;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);
        double baklava =22.50;
        System.out.println("bakLava= "+baklava);
        balance = balance-baklava;
        System.out.println("Remaining balance "+balance);

        double kenafa = 44.45;
        System.out.println("kenafa ="+kenafa);
        balance = balance-kenafa;
        System.out.println("Balance after purchasing kenafa= "+balance);
        balance= balance- kenafa;
        System.out.println("balance after kenafa= "+ balance);
        kenafa=kenafa/2;
        System.out.println("kenafa ="+kenafa);
        balance=balance-kenafa;
        System.out.println(" remaining balance= "+balance);

        double plov = 7.99;
        System.out.println("plov"+plov);
        balance = balance-plov;
        System.out.println("Balance after plov=" + balance);
        double cola = 3.0;
        System.out.println("cola= "+cola);
        cola=cola*4;
        System.out.println(cola);
        balance= balance-cola;
        System.out.println("remaining balance =" + balance);
        System.out.println("returning baklava="+baklava );
        balance = balance+ baklava;
        System.out.println("remaining balance after returning baklava "+balance);


    }
}
