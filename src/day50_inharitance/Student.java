package day50_inharitance;

public class Student extends Person {
    String school;
    public void study (String topic){
        System.out.println(name+ " is studying "+ topic+ " at school");
    }
}
