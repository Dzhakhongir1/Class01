package day61_exeptions_collections;

public class InsafficientBalanceExeption extends RuntimeException{

    public InsafficientBalanceExeption(){}
    public InsafficientBalanceExeption(String message){
        super(message);

    }
}
