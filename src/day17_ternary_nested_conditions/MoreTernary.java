package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate =50;
        String Reply = (hourlyRate>45) ? "accept" : "reject";
        System.out.println("Reply " + Reply);
        if (hourlyRate > 40){
            System.out.println("ACCEPT");
        }else{
            System.out.println("decline");
            String todaysClass = "java";
            String teacher = (todaysClass.equals("java")) ? "murodil/saim":"nadir";
            System.out.println(teacher);

            boolean isEligibleToDrive = true;
            String driving = (isEligibleToDrive) ? "has Dl, and can drive" : "No dl, cannot drive";
            System.out.println(driving);
        }
    }
}
