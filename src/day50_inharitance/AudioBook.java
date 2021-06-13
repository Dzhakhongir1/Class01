package day50_inharitance;

public class AudioBook extends Book {
    int length;
    String narrator;
    public void listen(){
        System.out.println("listening to "+ title);
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
        System.out.println("length = " + length);
    }

}
