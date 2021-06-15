package day53_inharitance.hiding;

public class Mobile extends Phone{
    String type = "Mobile";

    public static void use(){
        System.out.println("Using mobile phone");
    }
    public void text(){
        use();
        System.out.println("and sending a text message");
    }
}
