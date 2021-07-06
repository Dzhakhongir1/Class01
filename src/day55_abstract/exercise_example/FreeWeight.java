package day55_abstract.exercise_example;

public class FreeWeight extends Lifting {
    @Override
    public  void endLift(){
        System.out.println("Carefully re-rack dumbbells");
    }

    @Override
    public void perform() {
        System.out.println("Lifting Weight dumbbells");
    }

    @Override
    public int getCalories(int minutes) {
        return minutes*6;
    }


}
