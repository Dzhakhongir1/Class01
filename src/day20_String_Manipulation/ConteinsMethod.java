package day20_String_Manipulation;

public class ConteinsMethod {
    public static void main(String[] args) {
        System.out.println("java".contains("a"));
        String company = "Capital one";
        System.out.println(company.contains("j"));
        if (company.contains(" ")){
            System.out.println("multiple word company name");
        }
        String etsyTitle = "wooden spoon | Etsy";
        if (etsyTitle.contains("|")){
            System.out.println("Has what murodil requested");
        }
        String name = "Jaha";
        if (name.contains("J")&&name.contains("a")){
            System.out.println("right name ");
        }
    }
}
