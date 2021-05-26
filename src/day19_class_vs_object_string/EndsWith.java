package day19_class_vs_object_string;

public class EndsWith {
    public static void main(String[] args) {
        String url = ".com";
        if (url.endsWith(".com")){
            System.out.println("Commerial");
        }else if(url.endsWith(".ru")){
            System.out.println("Russian");
        }else if(url.endsWith(".gov")){
            System.out.println("Goverment");
        }else if(url.endsWith(".edu")){
            System.out.println("Education");
        }
    }
}
