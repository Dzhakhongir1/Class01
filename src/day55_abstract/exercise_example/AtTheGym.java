package day55_abstract.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new Running();
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("exercise.getCalories(30 minutes) = " + exercise.getCalories(30));

        running.start();
        running.perform();
        System.out.println("running.getCalories(30 minutes) = " + running.getCalories(30));

        swimming.start();
        swimming.perform();
        System.out.println("swimming.getCalories(30 minutes) = " + swimming.getCalories(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("freeWeight.getCalories(30 minutes) = " + freeWeight.getCalories(30));
    }
}
