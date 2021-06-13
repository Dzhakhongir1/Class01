package day50_inharitance;

public class StaticBlockTest {
    public static void main(String[] args) {
        //runs one like beforeCLASS in selenium ->called static init block
        // normally used to intialized static variables
        StaticBlockDemo st1 = new StaticBlockDemo();
        StaticBlockDemo st2 = new StaticBlockDemo();
        System.out.println(StaticBlockDemo.num);
        StaticBlockDemo st3= new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);
    }
}
