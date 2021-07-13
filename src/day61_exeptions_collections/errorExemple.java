package day61_exeptions_collections;

public class errorExemple {
    public static void main(String[] args) {
        myMethod();


    }
    static int counter=0;
    public static void myMethod(){
        System.out.println(counter++);
        myMethod();
    }
}
