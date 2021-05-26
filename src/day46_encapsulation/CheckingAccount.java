package day46_encapsulation;

public class CheckingAccount {
    private int balance;
    private int accountNumber;
    private String accountHolder;
    private String type;
    public void setAccountInfo(String accountHolder, String type, int balance, int accountNumber){
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setType(type);
        setBalance(balance);
    }
    public void setBalance(int balance){
        this.balance = balance;

    }
    public int getBalance(){
        return balance;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber =accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountHolder=" + accountHolder +
                ", accountNumber=" + accountNumber +
                ", balance=$'" + balance + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
