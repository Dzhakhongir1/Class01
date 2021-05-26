package Day26_Loops;

public class Multiplicationtable {
    public static void main(String[] args) {
        int number = 1;
        if (number<1||number>10){
            System.out.println("Invalid input");
            return;
        }
        for(int i=1;i<=10;i++){
            System.out.println(number+" x "+i+" = "+number*i);
        }

    }
}
