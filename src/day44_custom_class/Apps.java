package day44_custom_class;

public class Apps {
    String name;
    double version;
    public void open(){
        System.out.println("openning "+ name + " app version "+ version);
    }

    public static void main(String[] args) {
        Apps app1 = new Apps();
        app1.name= "Uber";
        app1.version = 5.6;
        app1.open();

    }
}
