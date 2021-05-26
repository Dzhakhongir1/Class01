package Day43_list_custom_classes;

public class Person {
    //data- variables
    String firstName;
    int age ;
    char gender;
    //behavior
    public void speak(){
        System.out.println("Person is speaking");
    }
}

class People{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName= "Bob";
        person1.age= 33;
        person1.gender='M';
        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);
        person1.speak();
        // each object will have their own data

        Person person2 = new Person();
        person2.firstName="Mike";
        person2.age=12;
        person2.gender='M';

        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);
        person2.speak();


        Person person3 = new Person();
        person3.firstName="Dora";
        person3.age=42;
        person3.gender='F';
        System.out.println(person3.firstName);
        System.out.println(person3.age);
        System.out.println(person3.gender);
        person3.speak();

    }
}