package day55_abstract.interface_demo;

public class ChromeDriver implements WebDriver {

    public ChromeDriver(){
        System.out.println("Opening chrome driver");
    }
    @Override
    public void get(String url) {
        System.out.println("Chrome Driver ready to navigate "+ url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Chrome driver - locating element by "+locator);
    }

    @Override
    public void quit() {
        System.out.println("closing chrome");
    }

    @Override
    public String getTitle() {
        return "No spoon";
    }
}
