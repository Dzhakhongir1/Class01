package day55_abstract.exercise_example;

public class Running extends Exercise{

    @Override
    public void perform() {
        System.out.println("Performing Running exercise");

    }

    @Override
    public int getCalories(int minutes) {
        return minutes*13;
    }
}
