package day56_polymorphism;

public class WebElementUtil {

    public static  void clickElement(WebElement element){
        System.out.println("Clicking on Elemnt");
        element.click();
    }
    public static WebElement getLinkText(String txt){
        System.out.println("searching link with text "+ txt);
        return new Link();
    }
}
