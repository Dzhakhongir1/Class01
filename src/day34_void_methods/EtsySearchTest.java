package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        openBrowser();
        navigateToErsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();

    }
    public static void openBrowser(){
        System.out.println("1.Click goodle button ");
    }
    public static void navigateToErsyUrl(){
        System.out.println("2.Look for Etsy. com");

    }
    public static void searchForWoodenSpoon(){
        System.out.println("3.Look for wooden spoon in the search bar");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("4.Make sure wooden spoon is shown on the screen ");
    }
}
