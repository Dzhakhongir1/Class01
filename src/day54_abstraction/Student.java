package day54_abstraction;

public abstract class Student {
    public void code (String language){
        System.out.println("Student is coding using "+language);
    }
    public abstract void attendClass();
}
class OnlineStudent extends Student {
    @Override
    public void attendClass(){
        System.out.println("Student attending java class");
  }
}
class School{
    public static void main(String[] args) {

    }
}
