package day52_inharitance.a2;

public class User {
    private String lvl;
    private String name;
    private int id;
    public  User(){
        System.out.println("USer class constructor ");
    }

    public User(String lvl, String name, int id) {
        System.out.println("User class 3 args constructor");
        this.lvl = lvl;
        this.name = name;
        this.id = id;
    }

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "lvl='" + lvl + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
