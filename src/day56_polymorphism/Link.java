package day56_polymorphism;

public class Link implements WebElement{
    public static final String TAG_NAME="a";


    @Override
    public void sendKeys(String text) {
        System.out.println("not supported");
    }

    @Override
    public void click() {
        System.out.println("clicking the link");
    }

    @Override
    public String getText() {
        System.out.println("getting link text");
        return "Oracle java";
    }
    public void getLinkHref(){
        System.out.println("https://www.google.com");
    }
}
