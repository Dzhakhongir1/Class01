package day52_inharitance;

public class Instagrram extends  MobileApp{
    public void postPhoto(){
        System.out.println("posting photo on instagram");
    }
    @Override
    public void useTheApp(int minutes){
        System.out.println("Using instagram app features");
        postPhoto();

    }
}
