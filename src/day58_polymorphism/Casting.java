package day58_polymorphism;

import javafx.concurrent.Worker;

public class Casting {
    public static void main(String[] args) {
        //variable of worker and object of superMan
        Workable worker = new SuperMan();
        worker.work("QA AMnager");
        worker.getPaid();
        ((Father)worker).raiseLid();
    }


}
