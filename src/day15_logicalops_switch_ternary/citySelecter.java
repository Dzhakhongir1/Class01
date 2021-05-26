package day15_logicalops_switch_ternary;

public class citySelecter {
    public static void main(String[] args) {
        String name = "tampa";
        if (name.equals("moscow")||name.equals("la")){
            System.out.println("willing to move ="+name);
        }else{
            System.out.println("not willing to move ="+name);
        }
        String teacher = "nadir";
        if (teacher.equals("Murodil")||teacher.equals("Saim")){
            System.out.println("It's java class with  "+teacher);
        }else {
            System.out.println("Soft skill calss with "+teacher);
        }
        String teacher1 = "nadir";
        if (teacher1.equals("saim")||teacher1.equals("murodil")){
            System.out.println("It is java class");
        }else if(teacher1.equals("nadir")) {
            System.out.println("Soft skill class "+teacher1);
        }else{
            System.out.println("Some class with gurham/Akbar");
        }
        String company = "Google";
        int salary = 105_000;
        if (company.equals("Google")&&salary>=1000_000){
            System.out.println("accept offer");
        }else{
            System.out.println("decline ");
        }
    }
}
