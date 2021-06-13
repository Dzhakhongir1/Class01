package day52_inharitance.a2;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1324);
        user1.setName("jaga");
        user1.setLvl("Student");

        Admin admin1 = new Admin();
        admin1.setId(41324);
        admin1.setLvl("Admib");
        admin1.setName("Saim");

        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2= new Admin("Gulia ",4138);
        System.out.println(admin2.toString());
    }
}
