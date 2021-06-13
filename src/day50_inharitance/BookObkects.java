package day50_inharitance;

public class BookObkects {
    public static void main(String[] args) {
        Book book= new Book();
        book.title="Java";
        book.author="Savitch";
        book.type="programming";
        book.price=85;
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook= new AudioBook();
        audioBook.author="Unmesh";
        audioBook.length=60;
        audioBook.narrator="Irina";
        audioBook.price=45;
        audioBook.title="SeleniumCookBook";
        audioBook.listen();



        Ebook Ebook= new Ebook();
        Ebook.title="Java data structure";
        Ebook.author="Savitch";
        Ebook.type="programming";
        Ebook.price=85;
        Ebook.size=2;
        Ebook.totalPages=1000;
        Ebook.readBook();

    }
}
