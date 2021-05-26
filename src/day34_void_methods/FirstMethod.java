package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();//call the method
        // when you debug and click step in will will go to the body to the body of the code that
        // was written originnaly
        // same method can be used multiple times ex bellow
        displayMessage();
        displayMessage();
        displayMessage();
        displayMessage();
        for (int i =0;i<10;i++){
            displayMessage();
        }
    }
    // first custom reusable method
    public static void displayMessage(){
        System.out.println("Hello B22 friends!");
    }


}
