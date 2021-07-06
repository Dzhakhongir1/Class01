package day56_polymorphism;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        WebElement logInLink = new Link();
        logInLink.click();
        logInLink.getText();
        logInLink.sendKeys("Bye");
        String text = logInLink.getText();
        logInLink.sendKeys(text);

        WebElement element = new InputField();
        element.sendKeys("wooden spoon");
        element.click();

        WebElementUtil.clickElement(logInLink);
        WebElementUtil.clickElement(element);

        WebElementUtil.getLinkText("log in");
    }
}
