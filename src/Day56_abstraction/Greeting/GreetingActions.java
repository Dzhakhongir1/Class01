package Day56_abstraction.Greeting;

public class GreetingActions {
    public static void main(String[] args) {
        Mountain mountain = new Mountain();
        mountain.hi();
        mountain.bye();

        Greeting gt = new Mountain();
        gt.bye();
        gt.hi();
    }
}
