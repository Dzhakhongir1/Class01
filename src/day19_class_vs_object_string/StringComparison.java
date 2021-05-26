package day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Omaha";
        System.out.println(city.equals("Omaha"));
        System.out.println(city.equals("omaha"));
        System.out.println(city.equalsIgnoreCase("omaha"));
        System.out.println(city.equalsIgnoreCase("OMAHA"));
        System.out.println(city.equalsIgnoreCase("Oma ha"));
        if (city.equals("Omaha")){
            System.out.println("Equals() true");
        }else{
            System.out.println("equals () false");
        }
        if (city.equalsIgnoreCase("OmAHA")){
            System.out.println("equals () true");
        }else{
            System.out.println("equals () false");
        }

    }
}
