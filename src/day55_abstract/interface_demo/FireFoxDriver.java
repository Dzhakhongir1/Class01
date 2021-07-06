package day55_abstract.interface_demo;

public class FireFoxDriver implements WebDriver {

    @Override
    public void get(String url) {
        System.out.println("FireFoxDriver - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Fire Fox finding element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("Close FireFoox");
    }

    @Override
    public String getTitle() {
        return "Wooden spoon";
    }
}
