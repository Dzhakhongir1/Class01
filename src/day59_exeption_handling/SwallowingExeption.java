package day59_exeption_handling;

public class SwallowingExeption {
    public static void main(String[] args) {
        try{
            System.out.println("hello");
            System.out.println(50/0);

        }catch (Exception ignore){}
        System.out.println("HOw are you today");
        System.out.println("We just suppresed/ swallowed the runTime exection");
        System.out.println("Error is no reported , we just ignore it ");
    }
}
