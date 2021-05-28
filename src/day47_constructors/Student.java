package day47_constructors;

public class Student {
    public Student(){
        System.out.println("not args Constructer");
    }
    public Student(String name){
        System.out.println("name param constructor | name = "+name);
    }
    public Student(int age){
        System.out.println("age para constructor | age ="+ age);
    }
    public Student (String name , int age){
        System.out.println("name&age pram constructor "+ name + "-"+ age);
    }
}
