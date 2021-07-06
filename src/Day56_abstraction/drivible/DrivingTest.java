package Day56_abstraction.drivible;

public class DrivingTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla ();
        model3.hi();
        model3.transportPeople();
        model3.autoPilot();
        model3.cost(25);
        model3.stop();
        model3.bye();

        Plane plane = new Plane();
        plane.hi();
        plane.transportPeople();
        plane.autoPilot();
        plane.cost(250);
        plane.land();
        plane.bye();
    }
}
