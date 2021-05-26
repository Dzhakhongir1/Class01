package day16_switch_ternary;

public class more_practice {
    public static void main(String[] args) {
        int numOfStudents = 400;
        int numberOfTeachers = 1;
        switch (numOfStudents){
            case 400:
                System.out.println("Be patient with the calss he can't keep up with all the questions ");
                break;
            case 250:
                System.out.println("Read case 400");
                break;
            case 20:
                System.out.println("Be more active but dont forfet case 400");
                break;
        }
    }
}
