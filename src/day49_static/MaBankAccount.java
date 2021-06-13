package day49_static;

public class MaBankAccount {
    static int balance = 500;
    String user;
    public void spend(int amount){
        System.out.println(user + " is spending $ "+amount);
        balance-=amount;

    }
    public void showBalance(){
        System.out.println("current balance "+balance);
    }

}
