package day56_polymorphism;

public class InputField implements WebElement {
    public static final String TAG_NAME= "input";

    @Override
    public void sendKeys(String text) {
        System.out.println("typing inside input field" + text);
    }

    @Override
    public void click() {
        System.out.println("");
    }

    @Override
    public String getText() {
        System.out.println("Getting text");
        return "java";
    }
    public String getValue(){
        System.out.println("Getting value in the input field");
        return "selenium";
    }
}
