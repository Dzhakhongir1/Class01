package day55_abstract.interface_demo;

public class DriverObjects {
    public static void main(String[] args) {
        ChromeDriver driver1 = new ChromeDriver();
        FireFoxDriver driver2 = new FireFoxDriver();
        WebDriver driver3 = new ChromeDriver();
        driver1.get("https://google.com");
        driver1.findElement("By.xpath(name'q')");
        System.out.println(driver1.getTitle());

    }
}
