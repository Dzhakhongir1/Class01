package day55_abstract.exercise_example;

public class Swimming extends Exercise{

    @Override
    public void perform() {
        System.out.println("Performing swimming exercise");

    }

    @Override
    public int getCalories(int minutes) {
        return minutes*2;
    }
}
