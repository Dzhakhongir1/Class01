package day50_inharitance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name="jaha";
        p1.age=20;
        p1.talk();
        p1.work("sted");
        p1.walk();
        Teacher t1= new Teacher();
        t1.teacherID=1234;
        t1.name= "saim";
        t1.age=25;
        t1.talk();
        t1.work("Teacher");
        t1.teach("java inheritance");

        Student student = new Student();
        student.name= "Ali";
        student.age=33;
        student.walk();
        student.talk();
        student.work("Java programmer");
        student.school= "CyberTek";
        student.study("java programming ");
    }
}
