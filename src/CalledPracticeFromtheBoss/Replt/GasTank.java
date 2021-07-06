package CalledPracticeFromtheBoss.Replt;

import java.util.Scanner;

public class GasTank {
    double amount =0.0;
    double capacity;
    public GasTank(double capacity){
        this.capacity =capacity;
    }
    public void addGas(double addingGas){
        amount+=addingGas;
        if (amount>capacity){
            amount=capacity;
        }
    }
    public void useGas(double galon){
        amount-=galon;
        if (amount<0){
            amount=0;
        }
    }
    public boolean isEmpty(){
        boolean check =false;
        if (amount<0.1){
            check= true;
        }else if(amount>0.1) {
            check= false;
        }
        return check;
    }
    public boolean isFull(){
        if (amount>(capacity-0.1) ){
            return true;
        }else {
            return false;
        }
    }
    public double getGasLevel(){
        return amount;
    }
    public double fillUp(){
        double result = capacity-amount;
        amount=capacity;
        return result;
    }
    static class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            GasTank gt = new GasTank(in.nextDouble());
            gt.addGas(in.nextDouble());
            System.out.println(gt.isFull());
            gt.useGas(in.nextDouble());
            System.out.println(gt.isEmpty());
            gt.fillUp();
            System.out.println(gt.getGasLevel());

        }
    }
}
