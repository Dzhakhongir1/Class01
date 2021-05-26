package Day43_list_custom_classes;

public class Employee {
    String name;
    String jobTitle;
    public void work() {
        System.out.println(name+" works as "+jobTitle);
    }
    }
    class Info{
        public static void main(String[] args) {
            Employee employee1= new Employee();
            employee1.name= "Jake";
            employee1.jobTitle="Tester";
            employee1.work();
            Employee employee2= new Employee();
            employee2.name= "Poal";
            employee2.jobTitle="Sm";
            employee2.work();
            Employee employee3= new Employee();
            employee3.name= "Dude";
            employee3.jobTitle="PO";
            employee3.work();
        }
    }

