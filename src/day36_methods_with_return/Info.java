package day36_methods_with_return;
import java.util.*;
public class Info {

    public static void main(String[] args) {
        System.out.println(" your name "+fullName());
        System.out.println("What is your maritial sttus true false ?");
        System.out.println("What is your age "+age());
        System.out.println("birth year "+getRandomYear());

        String name = fullName();
        boolean married=isMarried();
        int age = age();
        int year = getRandomYear();
        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);
        if(married){
            System.out.println("married ");
        }else{
            System.out.println("single");
        }





    }
    public static String fullName(){
        return "mike smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int age(){
        return 50;
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }

}
