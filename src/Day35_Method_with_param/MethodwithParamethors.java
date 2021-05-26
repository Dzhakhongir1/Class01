package Day35_Method_with_param;

import day34_void_methods.FirstMethod;

public class MethodwithParamethors {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            displayValue(i);
            FirstMethod.displayMessage();
            greetByName("jaha");
        }

    }
    public static void displayValue(int num){
        System.out.println("value of num is "+num);
    }

    public static void greetByName(String name){
        System.out.println("hello "+name+" how are you today ");
    }



}
