package Day56_abstraction.drivible;

import Day56_abstraction.Greeting.Greeting;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Plane extends Transportation implements SelfDriving, Greeting {
    @Override
    public void hi() {
        System.out.println("says bye");
    }

    @Override
    public void bye() {
        System.out.println("Says hi");
    }

    @Override
    public void autoPilot() {
        System.out.println("its auto pilot");
    }

    @Override
    public void transportPeople() {
        System.out.println("Plane transports people");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Cost to aporrate the plane " + (mile*10)+ " $");
    }

    public void land() {
        System.out.println("Plane is Landing - bucle Up");
    }
}
