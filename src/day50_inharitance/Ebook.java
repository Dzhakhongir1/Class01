package day50_inharitance;

public class Ebook extends Book{
    int size;
    int totalPages;
    public void readBook(){
        System.out.println(title +" is title of the book  and has" + totalPages +" pages  author of this book is "+author );
    }
}
