package Day56_abstraction.drivible;

import Day56_abstraction.Greeting.Greeting;

public class Tesla extends Transportation implements SelfDriving , Greeting {

    @Override
    public void transportPeople() {
        System.out.println("tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla cost "+ (mile*0.10)+" to drive "+ mile + " miles");
    }
    @Override
    public void autoPilot(){
        System.out.println("Tesla is self drive car");
    }
    public void hi(){
        System.out.println("Hello Hello peep peep");
    }
    public void bye(){
        System.out.println(" is saying bye v");
    }
}
